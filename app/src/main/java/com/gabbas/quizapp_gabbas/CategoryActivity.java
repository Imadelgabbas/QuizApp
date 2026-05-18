package com.gabbas.quizapp_gabbas;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.android.material.card.MaterialCardView;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public class CategoryActivity extends AppCompatActivity {

    private TextView tvUserCountry;
    private FusedLocationProviderClient fusedLocationClient;
    
    private String countryName = "Inconnu";
    private String countryCode = "Inconnu";
    private String regionName = "Inconnue";
    private String cityName = "Inconnue";
    
    private static final int LOCATION_PERMISSION_REQUEST_CODE = 1000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);

        tvUserCountry = findViewById(R.id.tvUserCountry);
        fusedLocationClient = LocationServices.getFusedLocationProviderClient(this);

        checkLocationPermission();

        // New CardView bindings
        MaterialCardView cardGeo = findViewById(R.id.cardGeo);
        MaterialCardView cardScience = findViewById(R.id.cardScience);
        MaterialCardView cardSport = findViewById(R.id.cardSport);
        MaterialCardView cardFilms = findViewById(R.id.cardFilms);
        MaterialCardView cardCulture = findViewById(R.id.cardCulture);
        MaterialCardView cardChatbot = findViewById(R.id.cardChatbot);
        MaterialCardView cardMaps = findViewById(R.id.cardMaps);

        View.OnClickListener categoryClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String category = "";
                int id = v.getId();
                
                if (id == R.id.cardGeo) category = "Géographie";
                else if (id == R.id.cardScience) category = "Science";
                else if (id == R.id.cardSport) category = "Sport";
                else if (id == R.id.cardFilms) category = "Films";
                else if (id == R.id.cardCulture) category = "Culture générale";
                else if (id == R.id.cardChatbot) {
                    Intent intent = new Intent(CategoryActivity.this, ChatbotActivity.class);
                    startActivity(intent);
                    return;
                } else if (id == R.id.cardMaps) {
                    Intent intent = new Intent(CategoryActivity.this, MapsActivity.class);
                    startActivity(intent);
                    return;
                }

                Intent intent = new Intent(CategoryActivity.this, QuizActivity.class);
                intent.putExtra("category", category);
                intent.putExtra("countryName", countryName);
                intent.putExtra("countryCode", countryCode);
                intent.putExtra("regionName", regionName);
                intent.putExtra("cityName", cityName);
                startActivity(intent);
            }
        };

        cardGeo.setOnClickListener(categoryClickListener);
        cardScience.setOnClickListener(categoryClickListener);
        cardSport.setOnClickListener(categoryClickListener);
        cardFilms.setOnClickListener(categoryClickListener);
        cardCulture.setOnClickListener(categoryClickListener);
        cardChatbot.setOnClickListener(categoryClickListener);
        cardMaps.setOnClickListener(categoryClickListener);
    }

    private void checkLocationPermission() {
        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED 
                && ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            
            ActivityCompat.requestPermissions(this, 
                    new String[]{Manifest.permission.ACCESS_FINE_LOCATION, Manifest.permission.ACCESS_COARSE_LOCATION}, 
                    LOCATION_PERMISSION_REQUEST_CODE);
        } else {
            getUserLocation();
        }
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if (requestCode == LOCATION_PERMISSION_REQUEST_CODE) {
            if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                getUserLocation();
            } else {
                tvUserCountry.setText("Localisation : non détectée");
            }
        }
    }

    private void getUserLocation() {
        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED) return;

        fusedLocationClient.getLastLocation().addOnSuccessListener(this, new OnSuccessListener<Location>() {
            @Override
            public void onSuccess(Location location) {
                if (location != null) {
                    double latitude = location.getLatitude();
                    double longitude = location.getLongitude();

                    Geocoder geocoder = new Geocoder(CategoryActivity.this, Locale.getDefault());
                    try {
                        List<Address> addresses = geocoder.getFromLocation(latitude, longitude, 1);
                        if (addresses != null && !addresses.isEmpty()) {
                            Address address = addresses.get(0);
                            
                            countryName = address.getCountryName();
                            countryCode = address.getCountryCode();
                            regionName = address.getAdminArea();
                            cityName = address.getLocality();

                            if (cityName != null && !cityName.isEmpty()) {
                                tvUserCountry.setText("Localisation : " + cityName + ", " + countryName);
                            } else {
                                tvUserCountry.setText("Localisation : " + countryName);
                            }

                            saveLocationToFirestore(latitude, longitude, countryName, countryCode, regionName, cityName);
                        }
                    } catch (IOException e) {
                        tvUserCountry.setText("Localisation : Erreur");
                    }
                }
            }
        });
    }

    private void saveLocationToFirestore(double lat, double lon, String country, String code, String region, String city) {
        String userId = FirebaseAuth.getInstance().getCurrentUser().getUid();
        if (userId == null) return;

        Map<String, Object> locationData = new HashMap<>();
        locationData.put("latitude", lat);
        locationData.put("longitude", lon);
        locationData.put("countryName", country);
        locationData.put("countryCode", code);
        locationData.put("regionName", region);
        locationData.put("cityName", city);
        locationData.put("lastLocationUpdate", System.currentTimeMillis());

        FirebaseFirestore.getInstance().collection("users").document(userId)
                .update(locationData);
    }
}
