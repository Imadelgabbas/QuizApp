package com.gabbas.quizapp_gabbas;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import com.gabbas.quizapp_gabbas.databinding.ActivityScoreBinding;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.HashMap;
import java.util.Map;

public class Score extends AppCompatActivity {

    private static final String DIFFICULTY_EASY = "EASY";
    private static final String DIFFICULTY_MEDIUM = "MEDIUM";
    private static final String DIFFICULTY_HARD = "HARD";

    ActivityScoreBinding binding;
    int score, totalQuestions;
    int bonusScore;
    int difficultyMultiplier;
    String category;
    String difficulty;

    FirebaseFirestore db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityScoreBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        db = FirebaseFirestore.getInstance();

        Intent intent = getIntent();
        score = intent.getIntExtra("score", 0);
        totalQuestions = intent.getIntExtra("totalQuestions", 5);
        category = intent.getStringExtra("category");
        difficulty = intent.getStringExtra("difficulty");
        if (difficulty == null || difficulty.trim().isEmpty()) {
            difficulty = DIFFICULTY_EASY;
        }
        difficultyMultiplier = getDifficultyMultiplier(difficulty);
        bonusScore = score * difficultyMultiplier;

        binding.tvCategoryResult.setText(category);
        binding.tvDifficultyResult.setText(getDifficultyLabel(difficulty));
        binding.tvBonusScore.setText(bonusScore + " points (" + score + " x " + difficultyMultiplier + ")");
        
        int percentage = (int) (((double) score / totalQuestions) * 100);
        binding.scoreProgressBar.setProgress(percentage);
        binding.tvPercentage.setText(percentage + "%");
        binding.tvScore.setText(score + " / " + totalQuestions);

        if (percentage >= 80) {
            binding.tvScoreMessage.setText("Excellent !");
        } else if (percentage >= 50) {
            binding.tvScoreMessage.setText("Bon travail !");
        } else {
            binding.tvScoreMessage.setText("À améliorer !");
        }

        saveScoreToFirestore(percentage);

        binding.bLogout.setOnClickListener(v -> {
            getSharedPreferences("auth", MODE_PRIVATE).edit().clear().apply();
            FirebaseAuth.getInstance().signOut();
            Toast.makeText(getApplicationContext(), "Déconnexion réussie !", Toast.LENGTH_SHORT).show();
            startActivity(new Intent(Score.this, MainActivity.class));
            finish();
        });

        binding.bTry.setOnClickListener(v -> {
            startActivity(new Intent(Score.this, CategoryActivity.class));
            finish();
        });
    }

    private void saveScoreToFirestore(int percentage) {
        FirebaseUser currentUser = FirebaseAuth.getInstance().getCurrentUser();
        String storedEmail = getSharedPreferences("auth", MODE_PRIVATE).getString("email", null);
        if (currentUser == null && (storedEmail == null || storedEmail.trim().isEmpty())) {
            return;
        }

        Map<String, Object> scoreData = new HashMap<>();
        if (currentUser != null) {
            scoreData.put("userId", currentUser.getUid());
            if (currentUser.getEmail() != null && !currentUser.getEmail().trim().isEmpty()) {
                scoreData.put("email", currentUser.getEmail());
            }
        } else {
            scoreData.put("email", storedEmail);
        }

        scoreData.put("category", category);
        scoreData.put("difficulty", difficulty);
        scoreData.put("difficultyLabel", getDifficultyLabel(difficulty));
        scoreData.put("score", score);
        scoreData.put("bonusScore", bonusScore);
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

    private int getDifficultyMultiplier(String difficultyCode) {
        if (DIFFICULTY_HARD.equalsIgnoreCase(difficultyCode)) {
            return 3;
        }
        if (DIFFICULTY_MEDIUM.equalsIgnoreCase(difficultyCode)) {
            return 2;
        }
        return 1;
    }

    private String getDifficultyLabel(String difficultyCode) {
        if (DIFFICULTY_HARD.equalsIgnoreCase(difficultyCode)) {
            return "Difficile";
        }
        if (DIFFICULTY_MEDIUM.equalsIgnoreCase(difficultyCode)) {
            return "Moyen";
        }
        return "Facile";
    }
}
