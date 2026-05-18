package com.gabbas.quizapp_gabbas;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ChatbotActivity extends AppCompatActivity {

    private EditText etMessage;
    private TextView tvChatLog;
    private ScrollView scrollChat;
    private ProgressBar progressBar;
    private Button btnSend, btnBack;

    // URL du serveur Flask local
    private static final String FLASK_URL = "http://172.20.10.3:5000/chat";

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
        btnBack = findViewById(R.id.btnBack);

        btnSend.setOnClickListener(v -> {
            String message = etMessage.getText().toString().trim();
            if (!message.isEmpty()) {
                sendMessageToChatbot(message);
            }
        });

        btnBack.setOnClickListener(v -> finish());
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
                result = performPostRequest(FLASK_URL, message);
            } catch (Exception e) {
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
        if (code == HttpURLConnection.HTTP_OK) {
            try (BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream(), StandardCharsets.UTF_8))) {
                StringBuilder response = new StringBuilder();
                String responseLine;
                while ((responseLine = br.readLine()) != null) {
                    response.append(responseLine.trim());
                }
                JSONObject jsonResponse = new JSONObject(response.toString());
                return jsonResponse.getString("response");
            }
        } else {
            return "Erreur Serveur (Code: " + code + ")";
        }
    }

    private void scrollToBottom() {
        scrollChat.post(() -> scrollChat.fullScroll(View.FOCUS_DOWN));
    }
}
