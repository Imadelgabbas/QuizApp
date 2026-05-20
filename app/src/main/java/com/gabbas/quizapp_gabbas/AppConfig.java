package com.gabbas.quizapp_gabbas;

public final class AppConfig {

    private AppConfig() {
        // Utility class
    }

    // When using `adb reverse tcp:5000 tcp:5000`, the Android device can reach
    // the Flask/Ollama server through 127.0.0.1:5000.
    public static final String FLASK_HOST = BuildConfig.FLASK_HOST;
    public static final String FLASK_PORT = BuildConfig.FLASK_PORT;
    public static final String FLASK_BASE_URL = BuildConfig.FLASK_BASE_URL;
    public static final String FLASK_CHAT_URL = FLASK_BASE_URL + "/chat";
}
