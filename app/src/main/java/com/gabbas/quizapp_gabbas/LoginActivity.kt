package com.gabbas.quizapp_gabbas

import android.Manifest
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import androidx.camera.core.CameraSelector
import androidx.camera.core.ImageCapture
import androidx.camera.core.ImageCaptureException
import androidx.camera.core.Preview
import androidx.camera.lifecycle.ProcessCameraProvider
import androidx.core.content.ContextCompat
import androidx.core.net.toUri
import com.gabbas.quizapp_gabbas.databinding.ActivityLoginBinding
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.cancel
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import okhttp3.MediaType.Companion.toMediaType
import okhttp3.MultipartBody
import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.RequestBody.Companion.asRequestBody
import org.json.JSONObject
import java.io.File
import java.io.IOException
import java.util.concurrent.TimeUnit

class LoginActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding
    private val okHttpClient = OkHttpClient.Builder()
        .connectTimeout(120, TimeUnit.SECONDS)
        .readTimeout(120, TimeUnit.SECONDS)
        .writeTimeout(120, TimeUnit.SECONDS)
        .build()
    private val uiScope = CoroutineScope(SupervisorJob() + Dispatchers.Main)

    private var imageCapture: ImageCapture? = null
    private var capturedPhotoFile: File? = null

    private val cameraPermissionLauncher =
        registerForActivityResult(ActivityResultContracts.RequestPermission()) { granted ->
            if (granted) {
                startCameraPreview()
            } else {
                showToast("La permission caméra est requise")
            }
        }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)
        Log.d("FaceAuth", "Backend URL = " + Constants.BACKEND_URL)

        binding.btnLogin.isEnabled = false
        binding.progressBar.visibility = View.GONE
        binding.ivCapturedPhoto.visibility = View.GONE

        binding.btnCapturePhoto.setOnClickListener {
            capturePhoto()
        }

        binding.btnLogin.setOnClickListener {
            loginWithFace()
        }

        requestCameraPermissionIfNeeded()
    }

    private fun requestCameraPermissionIfNeeded() {
        if (ContextCompat.checkSelfPermission(this, Manifest.permission.CAMERA) ==
            android.content.pm.PackageManager.PERMISSION_GRANTED
        ) {
            startCameraPreview()
        } else {
            cameraPermissionLauncher.launch(Manifest.permission.CAMERA)
        }
    }

    private fun startCameraPreview() {
        val cameraProviderFuture = ProcessCameraProvider.getInstance(this)
        cameraProviderFuture.addListener(
            {
                try {
                    val cameraProvider = cameraProviderFuture.get()
                    val preview = Preview.Builder().build().also {
                        it.setSurfaceProvider(binding.previewView.getSurfaceProvider())
                    }

                    imageCapture = ImageCapture.Builder()
                        .setCaptureMode(ImageCapture.CAPTURE_MODE_MINIMIZE_LATENCY)
                        .build()

                    val cameraSelector = CameraSelector.Builder()
                        .requireLensFacing(CameraSelector.LENS_FACING_FRONT)
                        .build()

                    cameraProvider.unbindAll()
                    cameraProvider.bindToLifecycle(
                        this,
                        cameraSelector,
                        preview,
                        imageCapture
                    )
                } catch (exception: Exception) {
                    showToast("Impossible de démarrer la caméra")
                }
            },
            ContextCompat.getMainExecutor(this)
        )
    }

    private fun capturePhoto() {
        val currentImageCapture = imageCapture
        if (currentImageCapture == null) {
            showToast("Caméra indisponible")
            return
        }

        val photoFile = File.createTempFile("login_face_", ".jpg", cacheDir)
        val outputOptions = ImageCapture.OutputFileOptions.Builder(photoFile).build()

        try {
            currentImageCapture.takePicture(
                outputOptions,
                ContextCompat.getMainExecutor(this),
                object : ImageCapture.OnImageSavedCallback {
                    override fun onImageSaved(outputFileResults: ImageCapture.OutputFileResults) {
                        capturedPhotoFile?.takeIf { it.exists() }?.delete()
                        capturedPhotoFile = photoFile
                        binding.ivCapturedPhoto.visibility = View.VISIBLE
                        binding.ivCapturedPhoto.setImageURI(photoFile.toUri())
                        binding.btnLogin.isEnabled = true
                    }

                    override fun onError(exception: ImageCaptureException) {
                        photoFile.delete()
                        showToast("Échec de la capture photo")
                    }
                }
            )
        } catch (exception: Exception) {
            photoFile.delete()
            showToast("Échec de la capture photo")
        }
    }

    private fun loginWithFace() {
        val photoFile = capturedPhotoFile
        val requestUrl = Constants.BACKEND_URL + "/login"
        if (photoFile == null || !photoFile.exists()) {
            showToast("Capturez une photo avant de continuer")
            return
        }

        setLoading(true)
        Log.d("FaceAuth", "Backend URL = " + Constants.BACKEND_URL)
        Log.d("FaceAuth", "Login URL = $requestUrl")
        showToast(requestUrl)

        uiScope.launch {
            try {
                val email = withContext(Dispatchers.IO) {
                    sendLoginRequest(photoFile, requestUrl)
                }
                getSharedPreferences("auth", MODE_PRIVATE)
                    .edit()
                    .putString("email", email)
                    .apply()
                showToast("Bienvenue $email")
                startActivity(
                    Intent(this@LoginActivity, CategoryActivity::class.java).apply {
                        flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
                    }
                )
                finish()
            } catch (exception: FaceNotRecognizedException) {
                Log.e("FaceAuth", "Login face not recognized", exception)
                showToast("Visage non reconnu")
            } catch (exception: Exception) {
                Log.e("FaceAuth", "Login exception", exception)
                showToast("Erreur de connexion")
            } finally {
                setLoading(false)
            }
        }
    }

    @Throws(IOException::class, FaceNotRecognizedException::class)
    private fun sendLoginRequest(photoFile: File, requestUrl: String): String {
        val requestBody = MultipartBody.Builder()
            .setType(MultipartBody.FORM)
            .addFormDataPart(
                "photo",
                photoFile.name,
                photoFile.asRequestBody("image/jpeg".toMediaType())
            )
            .build()

        val request = Request.Builder()
            .url(requestUrl)
            .post(requestBody)
            .build()

        okHttpClient.newCall(request).execute().use { response ->
            val responseBody = response.body?.string().orEmpty()
            Log.d("FaceAuth", "Login response body = $responseBody")
            return when {
                response.isSuccessful -> extractEmail(responseBody)
                response.code == 404 -> throw FaceNotRecognizedException()
                else -> throw IOException("Erreur de connexion")
            }
        }
    }

    private fun extractEmail(responseBody: String): String {
        if (responseBody.isBlank()) {
            return "utilisateur"
        }

        return try {
            val jsonObject = JSONObject(responseBody)
            jsonObject.optString("email")
                .takeIf { it.isNotBlank() }
                ?: jsonObject.optString("user")
                    .takeIf { it.isNotBlank() }
                ?: "utilisateur"
        } catch (_: Exception) {
            responseBody.trim('"').ifBlank { "utilisateur" }
        }
    }

    private fun setLoading(isLoading: Boolean) {
        binding.progressBar.visibility = if (isLoading) View.VISIBLE else View.GONE
        binding.btnCapturePhoto.isEnabled = !isLoading
        binding.btnLogin.isEnabled = !isLoading && capturedPhotoFile != null
    }

    private fun showToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }

    override fun onDestroy() {
        uiScope.cancel()
        capturedPhotoFile?.takeIf { it.exists() }?.delete()
        super.onDestroy()
    }

    private class FaceNotRecognizedException : Exception()
}
