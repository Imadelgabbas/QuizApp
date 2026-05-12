package com.gabbas.quizapp_gabbas;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.HashMap;
import java.util.Map;

public class Score extends AppCompatActivity {

    Button bLogout, bTry;
    ProgressBar scoreProgressBar;
    TextView tvScore, tvCategoryResult, tvScoreMessage, tvPercentage;
    int score, totalQuestions;
    String category;
    
    FirebaseFirestore db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);

        db = FirebaseFirestore.getInstance();

        tvScore = findViewById(R.id.tvScore);
        tvCategoryResult = findViewById(R.id.tvCategoryResult);
        tvScoreMessage = findViewById(R.id.tvScoreMessage);
        tvPercentage = findViewById(R.id.tvPercentage);
        scoreProgressBar = findViewById(R.id.scoreProgressBar);
        bLogout = findViewById(R.id.bLogout);
        bTry = findViewById(R.id.bTry);

        Intent intent = getIntent();
        score = intent.getIntExtra("score", 0);
        totalQuestions = intent.getIntExtra("totalQuestions", 5);
        category = intent.getStringExtra("category");

        if (tvCategoryResult != null) {
            tvCategoryResult.setText(category);
        }
        
        int percentage = (int) (((double) score / totalQuestions) * 100);
        
        if (scoreProgressBar != null) {
            scoreProgressBar.setProgress(percentage);
        }
        
        if (tvPercentage != null) {
            tvPercentage.setText(percentage + "%");
        }
        
        tvScore.setText(score + " / " + totalQuestions);

        // Dynamic message
        if (tvScoreMessage != null) {
            if (percentage >= 80) {
                tvScoreMessage.setText("Excellent !");
            } else if (percentage >= 50) {
                tvScoreMessage.setText("Bon travail !");
            } else {
                tvScoreMessage.setText("À améliorer !");
            }
        }

        // Firestore recording
        FirebaseUser currentUser = FirebaseAuth.getInstance().getCurrentUser();
        if (currentUser != null) {
            String userId = currentUser.getUid();
            
            Map<String, Object> scoreData = new HashMap<>();
            scoreData.put("userId", userId);
            scoreData.put("category", category);
            scoreData.put("score", score);
            scoreData.put("totalQuestions", totalQuestions);
            scoreData.put("percentage", percentage);
            scoreData.put("timestamp", System.currentTimeMillis());

            db.collection("scores")
                    .add(scoreData)
                    .addOnCompleteListener(new OnCompleteListener<DocumentReference>() {
                        @Override
                        public void onComplete(@NonNull Task<DocumentReference> task) {
                            if (task.isSuccessful()) {
                                Toast.makeText(Score.this, "Score enregistré", Toast.LENGTH_SHORT).show();
                            }
                        }
                    });
        }

        bLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirebaseAuth.getInstance().signOut();
                Toast.makeText(getApplicationContext(), "Déconnexion réussie !", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(Score.this, MainActivity.class));
                finish();
            }
        });

        bTry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Score.this, CategoryActivity.class));
                finish();
            }
        });
    }
}