package com.company.exception;

public class InsuffcientFundsException extends Exception {

    /**
     * Calls the Constructor of class Exception with the message text as argument
     */
    public InsuffcientFundsException() {
        super("The funds are insufficient.");
    }

    /**
     * @param message
     */
    public InsuffcientFundsException(String message) {
        super(message);
    }
}
