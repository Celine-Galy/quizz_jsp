package com.projects.quizz.models;

public class Question {
    private Integer id;
    private String wording;
    private Answer answer;
    private Theme theme;
    private Level level;

    public Question(Integer id, String wording, Answer answer, Theme theme, Level level) {
        this.id = id;
        this.wording = wording;
        this.answer = answer;
        this.theme = theme;
        this.level = level;
    }
}
