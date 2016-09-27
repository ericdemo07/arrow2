package com.arrow.util;

/**
 * This is the abstract superclass of exceptions that are thrown and
 * declared.
 * * <p>
 * This class ought to be called <em>GemFireException</em>
 * <p>
 * Created by ayush.shukla on 9/26/2016.
 */
public class ArrowException extends Exception {
    public ArrowException() {
        super();
    }

    public ArrowException(String message) {
        super(message);
    }

    public ArrowException(String message, Throwable cause) {
        super(message);
        this.initCause(cause);
    }

    public ArrowException(Throwable cause) {
        super();
        this.initCause(cause);
    }

    public Throwable getRootCause() {
        if (this.getCause() == null) return null;
        Throwable root = this.getCause();
        while (root != null) {
            if (root.getCause() == null) {
                break;
            } else {
                root = root.getCause();
            }
        }
        return root;
    }

    public String toString() {
        return "Exception occoured";
    }
}
