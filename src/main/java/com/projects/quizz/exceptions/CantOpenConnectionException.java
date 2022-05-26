package com.projects.quizz.exceptions;

public class CantOpenConnectionException extends RuntimeException {

    public CantOpenConnectionException(){
        super("Cannot Open DB Connection");
    }
}
