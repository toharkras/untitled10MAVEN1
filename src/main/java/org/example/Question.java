package org.example;

import java.util.Collection;
import java.util.List;

public class Question {
    private String type;
    private String difficulty;
    private String category;
    private String question;
    private String correct_answer;
    private String Incorrect_answer;
    private List<String> incorrect_answers;
    private String getEntity;

    public String getGetEntity() {
        return getEntity;
    }

    public void setGetEntity(String getEntity) {
        this.getEntity = getEntity;
    }

    public String getIncorrect_answer() {
        return Incorrect_answer;
    }

    public void setIncorrect_answer(String incorrect_answer) {
        Incorrect_answer = incorrect_answer;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public Collection<? extends String> getCorrect_answer() {
        return correct_answer;
    }

    public void setCorrect_answer(String correct_answer) {
        this.correct_answer = correct_answer;
    }

    public List<String> getIncorrect_answers() {
        return incorrect_answers;
    }

    public void setIncorrect_answers(List<String> incorrect_answers) {
        this.incorrect_answers = incorrect_answers;
    }
}
