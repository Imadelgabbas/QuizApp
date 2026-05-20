package com.gabbas.quizapp_gabbas.data;

public class Question {
    private String question;
    private String[] choices;
    private int correctAnswerIndex;
    private String difficulty;

    public Question(String question, String[] choices, int correctAnswerIndex, String difficulty) {
        this.question = question;
        this.choices = choices;
        this.correctAnswerIndex = correctAnswerIndex;
        this.difficulty = difficulty;
    }

    public String getQuestion() {
        return question;
    }

    public String[] getChoices() {
        return choices;
    }

    public int getCorrectAnswerIndex() {
        return correctAnswerIndex;
    }

    public String getDifficulty() {
        return difficulty;
    }
}
