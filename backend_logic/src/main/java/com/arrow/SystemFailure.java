package com.arrow;


public class SystemFailure {
    static int a;
    protected static volatile Error failure = null;

    public static void initiateException(Exception f) throws InternalArrowException {
        //SystemFailure.setFailure(f);
        throwFailure();
    }

    static private void throwFailure() throws InternalArrowException, Error {
        // Do not return normally...
        if (failure != null) throw failure;
    }

    public static void setFailure(Error failure) {
        if (failure == null) {
            throw new IllegalArgumentException("Exception Occoured");
        }
        SystemFailure.failure = failure;
        //notifyWatchDog();
    }

    static {
        a = 5;
    }
}
