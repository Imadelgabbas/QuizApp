package com.gabbas.quizapp_gabbas.data;

final class QuestionFactory {

    private QuestionFactory() {
    }

    static Question easy(String question, int correctAnswerIndex, String... choices) {
        return new Question(question, choices, correctAnswerIndex, "EASY");
    }

    static Question medium(String question, int correctAnswerIndex, String... choices) {
        return new Question(question, choices, correctAnswerIndex, "MEDIUM");
    }

    static Question hard(String question, int correctAnswerIndex, String... choices) {
        return new Question(question, choices, correctAnswerIndex, "HARD");
    }
}
