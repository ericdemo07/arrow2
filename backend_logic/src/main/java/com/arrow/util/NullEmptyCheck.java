package com.arrow.util;

/**
 * Created by ayush.shukla on 9/26/2016.
 */
public class NullEmptyCheck {

    private static NullEmptyCheck obj;

    private NullEmptyCheck() {
    }

    public static NullEmptyCheck getInstance() {
        if (obj == null) {
            obj = new NullEmptyCheck();
        }
        return obj;
    }

    public static boolean check(Object value) {
        if (value instanceof String) {
            if (value != null && !((String) value).isEmpty()) {
                return true;
            }
        } else if (value instanceof Integer) {
            if (value != null && (int) value != 0) {
                return true;
            }
        }
        return false;
    }
}


