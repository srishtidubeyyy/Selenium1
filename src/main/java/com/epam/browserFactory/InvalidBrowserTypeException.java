package com.epam.browserFactory;

public class InvalidBrowserTypeException extends RuntimeException {
    public InvalidBrowserTypeException( String message) {
        super(message);
    }
}
