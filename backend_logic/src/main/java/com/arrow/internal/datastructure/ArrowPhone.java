package com.arrow.internal.datastructure;

import java.util.regex.Pattern;

/**
 * Created by ayush.shukla on 10/17/2016.
 * <p>
 * this can hold country isd code, country code, country name and phone number
 * <p>
 * <code>91-IN-INDIA-3245678<code/>
 */
public final class ArrowPhone {
    String[] arr;
    Pattern commaPattern = Pattern.compile("-");

    public ArrowPhone(String phone) {
        arr = commaPattern.split(phone);
    }

    public int getCountryIsdCode() {
        return Integer.valueOf(this.arr[0]);
    }

    public String getCountryCode() {
        return this.arr[1];
    }

    public String getCountryName() {
        return this.arr[2];
    }

    public int getPhoneNumber() {
        return Integer.valueOf(this.arr[3]);
    }
}
