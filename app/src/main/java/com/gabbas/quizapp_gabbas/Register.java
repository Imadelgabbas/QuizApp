package com.gabbas.quizapp_gabbas;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.HashMap;
import java.util.Map;

public class Register extends AppCompatActivity {

    private static final String TAG = "RegisterActivity";
    EditText etMail, etPassword, etPassword1;
    Button bRegister;
    TextView tvLogin;
    
    // Firebase instances
    FirebaseAuth mAuth;
    FirebaseFirestore db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_email_register);

        // Initialisation Firebase
        mAuth = FirebaseAuth.getInstance();
        db = FirebaseFirestore.getInstance();

        etMail = (EditText) findViewById(R.id.etMail);
        etPassword = (EditText) findViewById(R.id.etPassword);
        etPassword1 = (EditText) findViewById(R.id.etPassword1);
        bRegister = (Button) findViewById(R.id.bRegister);
        tvLogin = (TextView) findViewById(R.id.tvLogin);

        bRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String mail = etMail.getText().toString().trim();
                String password = etPassword.getText().toString().trim();
                String password1 = etPassword1.getText().toString().trim();

                // Validation des champs
                if (TextUtils.isEmpty(mail)) {
                    etMail.setError("Email est requis");
                    return;
                }
                if (TextUtils.isEmpty(password)) {
                    etPassword.setError("Mot de passe est requis");
                    return;
                }
                if (password.length() < 6) {
                    etPassword.setError("Le mot de passe doit contenir au moins 6 caractères");
                    return;
                }
                if (!password.equals(password1)) {
                    etPassword1.setError("Les mots de passe ne correspondent pas");
                    return;
                }

                // Création du compte Firebase Auth
                mAuth.createUserWithEmailAndPassword(mail, password)
                        .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                            @Override
                            public void onComplete(@NonNull Task<AuthResult> task) {
                                if (task.isSuccessful()) {
                                    // Succès : Enregistrement dans Firestore
                                    Log.d(TAG, "createUserWithEmail:success");
                                    String userId = mAuth.getCurrentUser().getUid();
                                    
                                    Map<String, Object> user = new HashMap<>();
                                    user.put("uid", userId);
                                    user.put("email", mail);
                                    user.put("createdAt", System.currentTimeMillis());

                                    db.collection("users").document(userId)
                                            .set(user)
                                            .addOnCompleteListener(new OnCompleteListener<Void>() {
                                                @Override
                                                public void onComplete(@NonNull Task<Void> task) {
                                                    if (task.isSuccessful()) {
                                                        Log.d(TAG, "User profile created in Firestore");
                                                    } else {
                                                        Log.e(TAG, "Error creating user profile", task.getException());
                                                    }
                                                    Toast.makeText(Register.this, "Compte créé avec succès", Toast.LENGTH_SHORT).show();
                                                    Intent intent = new Intent(Register.this, CategoryActivity.class);
                                                    startActivity(intent);
                                                    finish();
                                                }
                                            });
                                } else {
                                    // Affichage de l'erreur Firebase
                                    Log.e(TAG, "createUserWithEmail:failure", task.getException());
                                    Toast.makeText(Register.this, "Erreur d'inscription: " + task.getException().getMessage(), Toast.LENGTH_LONG).show();
                                }
                            }
                        });
            }
        });

        // Lien pour retourner au Login
        tvLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish(); // Retourne à MainActivity
            }
        });
    }
}
