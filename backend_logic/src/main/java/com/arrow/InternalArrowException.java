package com.arrow;

/**
 * Created by ayush.shukla on 10/5/2016.
 */
public class InternalArrowException extends Exception {
    private static final long serialVersionUID = 6390043490679349593L;

    public InternalArrowException() {
        // TODO Auto-generated constructor stub
    }

    public InternalArrowException(double detailMessage) {
        this("" + detailMessage);
    }

    public InternalArrowException(float detailMessage) {
        this("" + detailMessage);
    }

    public InternalArrowException(long detailMessage) {
        this("" + detailMessage);
    }

    public InternalArrowException(int detailMessage) {
        this("" + detailMessage);
    }

    public InternalArrowException(char detailMessage) {
        this("" + detailMessage);
    }

    public InternalArrowException(boolean detailMessage) {
        this("" + detailMessage);
    }

    public InternalArrowException(Object detailMessage) {
        this("" + detailMessage);
        if (detailMessage instanceof Throwable)
            initCause((Throwable) detailMessage);
    }

    public InternalArrowException(String message, Throwable cause) {
        super(message, cause);
    }

    public InternalArrowException(Throwable cause) {
        super(cause);
    }

    public InternalArrowException(String message) {
        super(message);
    }

}
