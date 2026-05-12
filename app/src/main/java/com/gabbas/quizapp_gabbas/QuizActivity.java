package com.gabbas.quizapp_gabbas;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.gabbas.quizapp_gabbas.data.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class QuizActivity extends AppCompatActivity {

    private TextView tvCategory, tvQuestionCount, tvQuestion;
    private RadioGroup rgAnswers;
    private RadioButton rb1, rb2, rb3, rb4;
    private Button btnNext;
    private ProgressBar quizProgressBar;

    private List<Question> questionList;
    private int currentQuestionIndex = 0;
    private int score = 0;
    private String category, countryName, countryCode, cityName, regionName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        // 1. Récupération des données passées par l'Intent
        category = getIntent().getStringExtra("category");
        cityName = getIntent().getStringExtra("cityName");
        regionName = getIntent().getStringExtra("regionName");
        countryName = getIntent().getStringExtra("countryName");
        countryCode = getIntent().getStringExtra("countryCode");

        // Logs de débogage demandés
        Log.d("QuizApp", "Selected category: " + category);
        Log.d("QuizApp", "Detected city: " + cityName);
        Log.d("QuizApp", "Detected region: " + regionName);

        tvCategory = findViewById(R.id.tvCategoryTitle);
        tvQuestionCount = findViewById(R.id.tvQuestionCount);
        tvQuestion = findViewById(R.id.tvQuestion);
        rgAnswers = findViewById(R.id.rgAnswers);
        rb1 = findViewById(R.id.rb1);
        rb2 = findViewById(R.id.rb2);
        rb3 = findViewById(R.id.rb3);
        rb4 = findViewById(R.id.rb4);
        btnNext = findViewById(R.id.btnNext);
        quizProgressBar = findViewById(R.id.quizProgressBar);

        tvCategory.setText(category);

        // 2. Logique de chargement
        loadQuestions();
        
        if (questionList != null && !questionList.isEmpty()) {
            displayQuestion();
        } else {
            Toast.makeText(this, "Aucune question trouvée", Toast.LENGTH_SHORT).show();
            finish();
        }

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int selectedId = rgAnswers.getCheckedRadioButtonId();
                if (selectedId == -1) {
                    Toast.makeText(QuizActivity.this, "Veuillez choisir une réponse", Toast.LENGTH_SHORT).show();
                    return;
                }

                RadioButton selectedRb = findViewById(selectedId);
                int selectedIndex = rgAnswers.indexOfChild(selectedRb);

                // Vérification de la réponse avec l'index
                if (selectedIndex == questionList.get(currentQuestionIndex).getCorrectAnswerIndex()) {
                    score++;
                }

                currentQuestionIndex++;
                if (currentQuestionIndex < questionList.size()) {
                    displayQuestion();
                } else {
                    // Fin du quiz : ouverture de Score.java
                    Intent intent = new Intent(QuizActivity.this, Score.class);
                    intent.putExtra("score", score);
                    intent.putExtra("totalQuestions", questionList.size());
                    intent.putExtra("category", category);
                    startActivity(intent);
                    finish();
                }
            }
        });
    }

    private void displayQuestion() {
        rgAnswers.clearCheck();
        Question currentQuestion = questionList.get(currentQuestionIndex);
        
        tvQuestion.setText(currentQuestion.getQuestion());
        tvQuestionCount.setText("Question " + (currentQuestionIndex + 1) + "/" + questionList.size());
        
        // Update progress bar
        if (quizProgressBar != null) {
            int progress = (int) (((double) (currentQuestionIndex + 1) / questionList.size()) * 100);
            quizProgressBar.setProgress(progress);
        }

        String[] choices = currentQuestion.getChoices();
        rb1.setText(choices[0]);
        rb2.setText(choices[1]);
        rb3.setText(choices[2]);
        rb4.setText(choices[3]);

        if (currentQuestionIndex == questionList.size() - 1) {
            btnNext.setText("Terminer");
        } else {
            btnNext.setText("Suivant");
        }
    }

    private void loadQuestions() {
        String city = cityName == null ? "" : cityName.trim().toLowerCase();
        String region = regionName == null ? "" : regionName.trim().toLowerCase();
        
        ArrayList<Question> allQuestions = new ArrayList<>();

        if (city.contains("casablanca") || region.contains("casablanca")) {
            allQuestions = CasablancaQuestions.getQuestions(category);
        } else if (city.contains("rabat") || region.contains("rabat")) {
            allQuestions = RabatQuestions.getQuestions(category);
        } else if (city.contains("marrakech") || region.contains("marrakech")) {
            allQuestions = MarrakechQuestions.getQuestions(category);
        } else if (city.contains("fes") || city.contains("fès") || region.contains("fes") || region.contains("fès")) {
            allQuestions = FesQuestions.getQuestions(category);
        } else if (city.contains("tanger") || city.contains("tangier") || region.contains("tanger") || region.contains("tangier")) {
            allQuestions = TangerQuestions.getQuestions(category);
        } else if ("MA".equalsIgnoreCase(countryCode)) {
            allQuestions = MoroccoQuestions.getQuestions(category);
        } else {
            allQuestions = GenericQuestions.getQuestions(category);
        }

        // Mélanger et limiter à 5 questions
        Collections.shuffle(allQuestions);
        questionList = new ArrayList<>();
        int limit = Math.min(allQuestions.size(), 5);
        for (int i = 0; i < limit; i++) {
            questionList.add(allQuestions.get(i));
        }

        Log.d("QuizApp", "Questions loaded: " + questionList.size());
    }
}
