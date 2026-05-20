package com.gabbas.quizapp_gabbas;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.speech.RecognitionListener;
import android.speech.RecognizerIntent;
import android.speech.SpeechRecognizer;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import com.google.android.material.button.MaterialButton;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ChatbotActivity extends AppCompatActivity {

    private static final String TAG = "ChatbotActivity";
    private static final int REQUEST_RECORD_AUDIO_PERMISSION = 1001;
    private static final String SPEECH_LANGUAGE = "fr-FR";

    private EditText etMessage;
    private TextView tvChatLog;
    private ScrollView scrollChat;
    private ProgressBar progressBar;
    private Button btnBack;
    private MaterialButton btnSend;
    private MaterialButton btnMic;
    private SpeechRecognizer speechRecognizer;
    private Intent speechRecognizerIntent;
    private ColorStateList defaultMicIconTint;
    private boolean isListening;

    private final ExecutorService executorService = Executors.newSingleThreadExecutor();
    private final Handler handler = new Handler(Looper.getMainLooper());

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chatbot);

        etMessage = findViewById(R.id.etMessage);
        tvChatLog = findViewById(R.id.tvChatLog);
        scrollChat = findViewById(R.id.scrollChat);
        progressBar = findViewById(R.id.progressBar);
        btnSend = findViewById(R.id.btnSend);
        btnMic = findViewById(R.id.btnMic);
        btnBack = findViewById(R.id.btnBack);
        defaultMicIconTint = btnMic.getIconTint();

        initializeSpeechRecognizer();

        btnSend.setOnClickListener(v -> {
            String message = etMessage.getText().toString().trim();
            if (!message.isEmpty()) {
                sendMessageToChatbot(message);
            }
        });

        btnMic.setOnClickListener(v -> startVoiceRecognitionWithPermissionCheck());
        btnBack.setOnClickListener(v -> finish());
    }

    private void initializeSpeechRecognizer() {
        if (!SpeechRecognizer.isRecognitionAvailable(this)) {
            btnMic.setEnabled(false);
            return;
        }

        speechRecognizer = SpeechRecognizer.createSpeechRecognizer(this);
        speechRecognizer.setRecognitionListener(new RecognitionListener() {
            @Override
            public void onReadyForSpeech(Bundle params) {
                updateMicListeningState(true);
            }

            @Override
            public void onBeginningOfSpeech() {
                updateMicListeningState(true);
            }

            @Override
            public void onRmsChanged(float rmsdB) {
            }

            @Override
            public void onBufferReceived(byte[] buffer) {
            }

            @Override
            public void onEndOfSpeech() {
            }

            @Override
            public void onError(int error) {
                Log.w(TAG, "Speech recognition error: " + error);
                updateMicListeningState(false);
                showRecognitionFailedToast();
            }

            @Override
            public void onResults(Bundle results) {
                updateMicListeningState(false);
                ArrayList<String> matches = results.getStringArrayList(SpeechRecognizer.RESULTS_RECOGNITION);
                if (matches == null || matches.isEmpty()) {
                    showRecognitionFailedToast();
                    return;
                }

                applyRecognizedText(matches.get(0));
            }

            @Override
            public void onPartialResults(Bundle partialResults) {
            }

            @Override
            public void onEvent(int eventType, Bundle params) {
            }
        });

        speechRecognizerIntent = new Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH);
        speechRecognizerIntent.putExtra(
                RecognizerIntent.EXTRA_LANGUAGE_MODEL,
                RecognizerIntent.LANGUAGE_MODEL_FREE_FORM
        );
        speechRecognizerIntent.putExtra(RecognizerIntent.EXTRA_LANGUAGE, SPEECH_LANGUAGE);
        speechRecognizerIntent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_PREFERENCE, SPEECH_LANGUAGE);
    }

    private void startVoiceRecognitionWithPermissionCheck() {
        if (speechRecognizer == null) {
            showRecognitionFailedToast();
            return;
        }

        if (ContextCompat.checkSelfPermission(this, Manifest.permission.RECORD_AUDIO)
                != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(
                    this,
                    new String[]{Manifest.permission.RECORD_AUDIO},
                    REQUEST_RECORD_AUDIO_PERMISSION
            );
            return;
        }

        startVoiceRecognition();
    }

    private void startVoiceRecognition() {
        if (speechRecognizer == null) {
            showRecognitionFailedToast();
            return;
        }

        if (isListening) {
            return;
        }

        updateMicListeningState(true);
        speechRecognizer.startListening(speechRecognizerIntent);
    }

    private void applyRecognizedText(String recognizedText) {
        String currentText = etMessage.getText().toString().trim();
        String updatedText = currentText.isEmpty()
                ? recognizedText
                : currentText + " " + recognizedText;
        etMessage.setText(updatedText);
        etMessage.setSelection(updatedText.length());
        etMessage.requestFocus();
    }

    private void updateMicListeningState(boolean listening) {
        isListening = listening;
        if (listening) {
            btnMic.setIconTint(ColorStateList.valueOf(ContextCompat.getColor(this, R.color.errorColor)));
            return;
        }

        if (defaultMicIconTint != null) {
            btnMic.setIconTint(defaultMicIconTint);
        } else {
            btnMic.setIconTint(ColorStateList.valueOf(ContextCompat.getColor(this, android.R.color.white)));
        }
    }

    private void showRecognitionFailedToast() {
        Toast.makeText(this, R.string.chatbot_voice_recognition_failed, Toast.LENGTH_SHORT).show();
    }

    private void sendMessageToChatbot(String message) {
        // Afficher le message de l'utilisateur
        tvChatLog.append("\nVous: " + message + "\n");
        etMessage.setText("");
        scrollToBottom();

        // UI Feedback
        progressBar.setVisibility(View.VISIBLE);
        btnSend.setEnabled(false);

        executorService.execute(() -> {
            String result;
            try {
                Log.d(TAG, "Appel de l'URL: " + AppConfig.FLASK_CHAT_URL);
                result = performPostRequest(AppConfig.FLASK_CHAT_URL, message);
            } catch (Exception e) {
                Log.e(TAG, "Erreur lors de la requête POST vers " + AppConfig.FLASK_CHAT_URL, e);
                result = "Le chatbot n’est pas disponible. Vérifiez que le serveur Ollama est lancé.\n(Détail: " + e.getMessage() + ")";
            }

            final String finalResult = result;
            handler.post(() -> {
                progressBar.setVisibility(View.GONE);
                btnSend.setEnabled(true);
                tvChatLog.append("\nChatbot: " + finalResult + "\n");
                scrollToBottom();
            });
        });
    }

    private String performPostRequest(String targetURL, String message) throws Exception {
        URL url = new URL(targetURL);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("POST");
        conn.setRequestProperty("Content-Type", "application/json; utf-8");
        conn.setRequestProperty("Accept", "application/json");
        conn.setDoOutput(true);
        conn.setConnectTimeout(5000); // 5 secondes
        conn.setReadTimeout(60000);    // Ollama peut mettre du temps à répondre

        JSONObject jsonParam = new JSONObject();
        jsonParam.put("message", message);

        try (OutputStream os = conn.getOutputStream()) {
            byte[] input = jsonParam.toString().getBytes(StandardCharsets.UTF_8);
            os.write(input, 0, input.length);
        }

        int code = conn.getResponseCode();
        Log.d(TAG, "Code de réponse HTTP: " + code);

        if (code == HttpURLConnection.HTTP_OK) {
            try (BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream(), StandardCharsets.UTF_8))) {
                StringBuilder response = new StringBuilder();
                String responseLine;
                while ((responseLine = br.readLine()) != null) {
                    response.append(responseLine.trim());
                }
                String responseStr = response.toString();
                
                // Log du JSON complet reçu
                Log.d(TAG, "JSON reçu complet: " + responseStr);

                try {
                    JSONObject jsonResponse = new JSONObject(responseStr);
                    // On utilise "reply" conformément au nouveau Flask
                    return jsonResponse.getString("reply");
                } catch (JSONException e) {
                    Log.e(TAG, "Erreur JSONException lors du parsing de la réponse: " + e.getMessage(), e);
                    return "Erreur format JSON: " + e.getMessage();
                }
            }
        } else {
            Log.e(TAG, "Erreur serveur: Code " + code);
            return "Erreur Serveur (Code: " + code + ")";
        }
    }

    private void scrollToBottom() {
        scrollChat.post(() -> scrollChat.fullScroll(View.FOCUS_DOWN));
    }

    @Override
    public void onRequestPermissionsResult(
            int requestCode,
            @NonNull String[] permissions,
            @NonNull int[] grantResults
    ) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if (requestCode != REQUEST_RECORD_AUDIO_PERMISSION) {
            return;
        }

        if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
            startVoiceRecognition();
        } else {
            Toast.makeText(this, R.string.chatbot_voice_permission_required, Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    protected void onDestroy() {
        if (speechRecognizer != null) {
            speechRecognizer.destroy();
            speechRecognizer = null;
        }
        executorService.shutdown();
        super.onDestroy();
    }
}
