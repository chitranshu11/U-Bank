package com.company.ubank.exceptions;

public class IncorrectPasswordException extends Exception {
    public IncorrectPasswordException (String message) {
        super(message);
    }
}
