package com.projects.quizz.models.db;

public enum TableName {
    USER("user"),
    ROLE("role"),
    QUESTION("question"),
    ANSWER("answer"),
    THEME("theme"),
    LEVEL("level");

    private final String name;

    TableName(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
