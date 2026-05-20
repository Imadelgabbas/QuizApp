package com.gabbas.quizapp_gabbas

import android.Manifest
import android.content.Intent
import android.content.pm.PackageManager
import android.location.Geocoder
import android.location.Location
import android.os.Bundle
import android.view.View
import androidx.annotation.NonNull
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AlertDialog
import androidx.core.app.ActivityCompat
import com.gabbas.quizapp_gabbas.databinding.ActivityCategoryBinding
import com.google.android.gms.location.FusedLocationProviderClient
import com.google.android.gms.location.LocationServices
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FirebaseFirestore
import java.io.IOException
import java.util.Locale

class CategoryActivity : AppCompatActivity() {

    private lateinit var binding: ActivityCategoryBinding
    private lateinit var fusedLocationClient: FusedLocationProviderClient

    private val authPreferences by lazy { getSharedPreferences("auth", MODE_PRIVATE) }

    private var countryName: String = "Inconnu"
    private var countryCode: String = "Inconnu"
    private var regionName: String = "Inconnue"
    private var cityName: String = "Inconnue"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCategoryBinding.inflate(layoutInflater)
        setContentView(binding.root)

        fusedLocationClient = LocationServices.getFusedLocationProviderClient(this)

        binding.btnLogout.setOnClickListener {
            logout()
        }

        checkLocationPermission()
        bindCategoryClicks()
        updateLogoutVisibility()
    }

    override fun onStart() {
        super.onStart()
        updateLogoutVisibility()
    }

    private fun updateLogoutVisibility() {
        val email = authPreferences.getString("email", null)
        binding.btnLogout.visibility = if (email.isNullOrBlank()) View.GONE else View.VISIBLE
    }

    private fun logout() {
        authPreferences.edit().clear().apply()
        startActivity(
            Intent(this, MainActivity::class.java).apply {
                flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
            }
        )
        finish()
    }

    private fun bindCategoryClicks() {
        val categoryClickListener = View.OnClickListener { view ->
            val category = when (view.id) {
                R.id.cardGeo -> "Géographie"
                R.id.cardScience -> "Science"
                R.id.cardSport -> "Sport"
                R.id.cardFilms -> "Films"
                R.id.cardCulture -> "Culture générale"
                R.id.cardChatbot -> {
                    startActivity(Intent(this, ChatbotActivity::class.java))
                    return@OnClickListener
                }
                R.id.cardMaps -> {
                    startActivity(Intent(this, MapsActivity::class.java))
                    return@OnClickListener
                }
                else -> return@OnClickListener
            }

            showDifficultyDialog(category)
        }

        binding.cardGeo.setOnClickListener(categoryClickListener)
        binding.cardScience.setOnClickListener(categoryClickListener)
        binding.cardSport.setOnClickListener(categoryClickListener)
        binding.cardFilms.setOnClickListener(categoryClickListener)
        binding.cardCulture.setOnClickListener(categoryClickListener)
        binding.cardChatbot.setOnClickListener(categoryClickListener)
        binding.cardMaps.setOnClickListener(categoryClickListener)
    }

    private fun showDifficultyDialog(category: String) {
        val labels = arrayOf(
            "Facile — questions simples, 30 secondes par question",
            "Moyen — questions intermédiaires, 20 secondes par question",
            "Difficile — questions difficiles, 15 secondes par question"
        )
        val values = arrayOf("EASY", "MEDIUM", "HARD")

        AlertDialog.Builder(this)
            .setTitle("Choisir une difficulté")
            .setItems(labels) { _, which ->
                startActivity(
                    Intent(this, QuizActivity::class.java).apply {
                        putExtra("category", category)
                        putExtra("difficulty", values[which])
                        putExtra("countryName", countryName)
                        putExtra("countryCode", countryCode)
                        putExtra("regionName", regionName)
                        putExtra("cityName", cityName)
                    }
                )
            }
            .setNegativeButton("Annuler", null)
            .show()
    }

    private fun checkLocationPermission() {
        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) !=
            PackageManager.PERMISSION_GRANTED &&
            ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) !=
            PackageManager.PERMISSION_GRANTED
        ) {
            ActivityCompat.requestPermissions(
                this,
                arrayOf(
                    Manifest.permission.ACCESS_FINE_LOCATION,
                    Manifest.permission.ACCESS_COARSE_LOCATION
                ),
                LOCATION_PERMISSION_REQUEST_CODE
            )
        } else {
            getUserLocation()
        }
    }

    override fun onRequestPermissionsResult(
        requestCode: Int,
        @NonNull permissions: Array<String>,
        @NonNull grantResults: IntArray
    ) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        if (requestCode != LOCATION_PERMISSION_REQUEST_CODE) {
            return
        }

        if (grantResults.isNotEmpty() && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
            getUserLocation()
        } else {
            binding.tvUserCountry.text = "Localisation : non détectée"
        }
    }

    private fun getUserLocation() {
        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) !=
            PackageManager.PERMISSION_GRANTED
        ) {
            return
        }

        fusedLocationClient.lastLocation.addOnSuccessListener(this) { location: Location? ->
            if (location != null) {
                updateLocationUi(location)
            }
        }
    }

    private fun updateLocationUi(location: Location) {
        val geocoder = Geocoder(this, Locale.getDefault())
        try {
            val addresses = geocoder.getFromLocation(location.latitude, location.longitude, 1)
            if (!addresses.isNullOrEmpty()) {
                val address = addresses[0]

                countryName = address.countryName ?: countryName
                countryCode = address.countryCode ?: countryCode
                regionName = address.adminArea ?: regionName
                cityName = address.locality ?: cityName

                binding.tvUserCountry.text = if (!cityName.isNullOrEmpty()) {
                    "Localisation : $cityName, $countryName"
                } else {
                    "Localisation : $countryName"
                }

                saveLocationToFirestore(
                    location.latitude,
                    location.longitude,
                    countryName,
                    countryCode,
                    regionName,
                    cityName
                )
            }
        } catch (_: IOException) {
            binding.tvUserCountry.text = "Localisation : Erreur"
        }
    }

    private fun saveLocationToFirestore(
        lat: Double,
        lon: Double,
        country: String,
        code: String,
        region: String,
        city: String
    ) {
        val currentUser = FirebaseAuth.getInstance().currentUser ?: return
        val locationData = hashMapOf<String, Any>(
            "latitude" to lat,
            "longitude" to lon,
            "countryName" to country,
            "countryCode" to code,
            "regionName" to region,
            "cityName" to city,
            "lastLocationUpdate" to System.currentTimeMillis()
        )

        FirebaseFirestore.getInstance()
            .collection("users")
            .document(currentUser.uid)
            .update(locationData)
    }

    companion object {
        private const val LOCATION_PERMISSION_REQUEST_CODE = 1000
    }
}
