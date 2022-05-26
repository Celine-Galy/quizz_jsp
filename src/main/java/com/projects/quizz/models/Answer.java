package com.projects.quizz.models;

public class Answer {

    private Integer id;
    private String wording;
    private boolean isRight;

    public Answer(Integer id, String wording, boolean isRight) {
        this.id = id;
        this.wording = wording;
        this.isRight = isRight;
    }

    public Answer() {

    }
}
