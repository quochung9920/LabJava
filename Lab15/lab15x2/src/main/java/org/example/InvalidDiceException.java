package org.example;

public class InvalidDiceException extends RuntimeException {
    public InvalidDiceException(String message) {
        super(message);
    }
}
