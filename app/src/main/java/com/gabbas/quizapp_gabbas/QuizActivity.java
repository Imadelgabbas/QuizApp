package com.gabbas.quizapp_gabbas;

import android.content.Intent;
import android.os.CountDownTimer;
import android.os.Bundle;
import android.util.Log;
import android.widget.RadioButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import com.gabbas.quizapp_gabbas.databinding.ActivityQuizBinding;
import com.gabbas.quizapp_gabbas.data.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class QuizActivity extends AppCompatActivity {

    private static final int QUESTION_LIMIT = 5;
    private static final String DIFFICULTY_EASY = "EASY";
    private static final String DIFFICULTY_MEDIUM = "MEDIUM";
    private static final String DIFFICULTY_HARD = "HARD";

    private ActivityQuizBinding binding;

    private List<Question> questionList;
    private int currentQuestionIndex = 0;
    private int score = 0;
    private String category, countryName, countryCode, cityName, regionName;
    private String difficulty;
    private long questionDurationMs;
    private CountDownTimer countDownTimer;
    private boolean answerLocked;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityQuizBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        category = getIntent().getStringExtra("category");
        cityName = getIntent().getStringExtra("cityName");
        regionName = getIntent().getStringExtra("regionName");
        countryName = getIntent().getStringExtra("countryName");
        countryCode = getIntent().getStringExtra("countryCode");
        difficulty = getIntent().getStringExtra("difficulty");
        if (difficulty == null || difficulty.trim().isEmpty()) {
            difficulty = DIFFICULTY_EASY;
        }
        questionDurationMs = getQuestionDurationMs(difficulty);

        Log.d("QuizApp", "Selected category: " + category);
        Log.d("QuizApp", "Detected city: " + cityName);
        Log.d("QuizApp", "Detected region: " + regionName);
        Log.d("QuizApp", "Selected difficulty: " + difficulty);

        binding.tvCategoryTitle.setText(category);
        binding.tvDifficultyBadge.setText(getDifficultyLabel(difficulty));

        loadQuestions();

        if (questionList != null && !questionList.isEmpty()) {
            displayQuestion();
        } else {
            Toast.makeText(this, "Aucune question trouvée pour cette difficulté", Toast.LENGTH_SHORT).show();
            finish();
        }

        binding.btnNext.setOnClickListener(v -> handleAnswerSubmission(false));
    }

    private void displayQuestion() {
        answerLocked = false;
        cancelTimer();
        binding.rgAnswers.clearCheck();

        Question currentQuestion = questionList.get(currentQuestionIndex);

        binding.tvQuestion.setText(currentQuestion.getQuestion());
        binding.tvQuestionCount.setText("Question " + (currentQuestionIndex + 1) + "/" + questionList.size());
        int progress = (int) (((double) (currentQuestionIndex + 1) / questionList.size()) * 100);
        binding.quizProgressBar.setProgress(progress);

        String[] choices = currentQuestion.getChoices();
        binding.rb1.setText(choices[0]);
        binding.rb2.setText(choices[1]);
        binding.rb3.setText(choices[2]);
        binding.rb4.setText(choices[3]);

        if (currentQuestionIndex == questionList.size() - 1) {
            binding.btnNext.setText("Terminer");
        } else {
            binding.btnNext.setText("Suivant");
        }

        startTimer();
    }

    private void startTimer() {
        updateTimerDisplay(questionDurationMs);
        countDownTimer = new CountDownTimer(questionDurationMs, 1000L) {
            @Override
            public void onTick(long millisUntilFinished) {
                updateTimerDisplay(millisUntilFinished);
            }

            @Override
            public void onFinish() {
                updateTimerDisplay(0L);
                handleAnswerSubmission(true);
            }
        }.start();
    }

    private void updateTimerDisplay(long millisLeft) {
        long secondsLeft = (long) Math.ceil(millisLeft / 1000.0d);
        binding.tvTimer.setText("\u23F1 " + secondsLeft + "s");

        float ratio = questionDurationMs == 0L ? 0f : (float) millisLeft / (float) questionDurationMs;
        int colorRes;
        if (ratio > 0.5f) {
            colorRes = R.color.success_green;
        } else if (ratio >= 0.25f) {
            colorRes = R.color.amber_accent;
        } else {
            colorRes = R.color.danger_red;
        }
        binding.tvTimer.setTextColor(ContextCompat.getColor(this, colorRes));
    }

    private void handleAnswerSubmission(boolean timedOut) {
        if (answerLocked) {
            return;
        }

        int selectedId = binding.rgAnswers.getCheckedRadioButtonId();
        if (!timedOut && selectedId == -1) {
            Toast.makeText(this, "Veuillez choisir une réponse", Toast.LENGTH_SHORT).show();
            return;
        }

        answerLocked = true;
        cancelTimer();

        if (!timedOut && selectedId != -1) {
            RadioButton selectedRb = findViewById(selectedId);
            int selectedIndex = binding.rgAnswers.indexOfChild(selectedRb);
            if (selectedIndex == questionList.get(currentQuestionIndex).getCorrectAnswerIndex()) {
                score++;
            }
        }

        currentQuestionIndex++;
        if (currentQuestionIndex < questionList.size()) {
            displayQuestion();
            return;
        }

        Intent intent = new Intent(QuizActivity.this, Score.class);
        intent.putExtra("score", score);
        intent.putExtra("totalQuestions", questionList.size());
        intent.putExtra("category", category);
        intent.putExtra("difficulty", difficulty);
        startActivity(intent);
        finish();
    }

    private void cancelTimer() {
        if (countDownTimer != null) {
            countDownTimer.cancel();
            countDownTimer = null;
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

        questionList = new ArrayList<>();
        for (Question question : allQuestions) {
            if (difficulty.equalsIgnoreCase(question.getDifficulty())) {
                questionList.add(question);
            }
        }

        Collections.shuffle(questionList);
        List<Question> limitedQuestions = new ArrayList<>();
        int limit = Math.min(questionList.size(), QUESTION_LIMIT);
        for (int i = 0; i < limit; i++) {
            limitedQuestions.add(questionList.get(i));
        }
        questionList = limitedQuestions;

        Log.d("QuizApp", "Questions loaded: " + questionList.size());
    }

    private long getQuestionDurationMs(String difficultyCode) {
        if (DIFFICULTY_HARD.equalsIgnoreCase(difficultyCode)) {
            return 15000L;
        }
        if (DIFFICULTY_MEDIUM.equalsIgnoreCase(difficultyCode)) {
            return 20000L;
        }
        return 30000L;
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

    @Override
    protected void onDestroy() {
        cancelTimer();
        super.onDestroy();
    }
}
