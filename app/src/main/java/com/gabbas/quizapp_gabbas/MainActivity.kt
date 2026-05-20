package com.gabbas.quizapp_gabbas

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isVisible
import com.gabbas.quizapp_gabbas.databinding.ActivityMainBinding
import com.google.firebase.auth.FirebaseAuth

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var auth: FirebaseAuth
    private val authPreferences by lazy { getSharedPreferences("auth", MODE_PRIVATE) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        auth = FirebaseAuth.getInstance()

        binding.btnFaceRegister.setOnClickListener {
            startActivity(Intent(this, RegisterActivity::class.java))
        }

        binding.btnFaceLogin.setOnClickListener {
            startActivity(Intent(this, LoginActivity::class.java))
        }

        binding.btnLogout.setOnClickListener {
            logoutFromFaceAuth()
        }

        binding.bLogin.setOnClickListener {
            signInWithEmailPassword()
        }

        binding.tvRegister.setOnClickListener {
            startActivity(Intent(this, Register::class.java))
        }
    }

    override fun onStart() {
        super.onStart()
        updateAuthUi()
    }

    private fun updateAuthUi() {
        val email = authPreferences.getString("email", null)
        val isLoggedIn = !email.isNullOrBlank()

        binding.layoutFaceAuthActions.isVisible = !isLoggedIn
        binding.btnLogout.isVisible = isLoggedIn
        binding.cardCredentialLogin.isVisible = !isLoggedIn
        binding.tvRegister.isVisible = !isLoggedIn
        binding.tvSubtitle.text = if (isLoggedIn) {
            "Connecté en tant que $email"
        } else {
            "Choisissez une méthode de connexion"
        }
    }

    private fun logoutFromFaceAuth() {
        authPreferences.edit().clear().apply()
        startActivity(
            Intent(this, MainActivity::class.java).apply {
                flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
            }
        )
        finish()
    }

    private fun signInWithEmailPassword() {
        val email = binding.etMail.text?.toString()?.trim().orEmpty()
        val password = binding.etPassword.text?.toString()?.trim().orEmpty()

        if (email.isBlank()) {
            binding.etMail.error = "Email est requis"
            return
        }

        if (password.isBlank()) {
            binding.etPassword.error = "Mot de passe est requis"
            return
        }

        auth.signInWithEmailAndPassword(email, password)
            .addOnCompleteListener(this) { task ->
                if (task.isSuccessful) {
                    Log.d(TAG, "signInWithEmail:success")
                    Toast.makeText(this, "Connexion réussie", Toast.LENGTH_SHORT).show()
                    startActivity(Intent(this, CategoryActivity::class.java))
                    finish()
                } else {
                    Log.e(TAG, "signInWithEmail:failure", task.exception)
                    Toast.makeText(
                        this,
                        "Erreur d'authentification: ${task.exception?.message.orEmpty()}",
                        Toast.LENGTH_LONG
                    ).show()
                }
            }
    }

    companion object {
        private const val TAG = "MainActivity"
    }
}
