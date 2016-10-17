package com.arrow.internal.datastructure;

import java.util.regex.Pattern;

/**
 * Created by ayush.shukla on 10/17/2016.
 * <p>
 * this will hold country name, country isd code and country code
 * <p>
 * <code>91-IN-INDIA</>
 */
public final class ArrowPhone {
    String[] arr;
    Pattern commaPattern = Pattern.compile("-");

    public ArrowPhone(String phone) {
        arr = commaPattern.split(phone);
    }

    public String getCountryName() {
        return this.arr[2];
    }

    public int getCountryIsdCode() {
        return Integer.valueOf(this.arr[0]);
    }

    public String getCountryCode() {
        return this.arr[1];
    }
}
