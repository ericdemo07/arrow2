package com.arrow.model;

import com.arrow.internal.datastructure.ArrowDate;

/**
 * Created by ayush.shukla on 10/6/2016.
 */
public class RegisterRequestServiceModel2 {
    private String shopperId;
    private Boolean otpFlag;
    private String gender;
    private ArrowDate birthDate;
    private String country;

    public RegisterRequestServiceModel2() {
    }

    public RegisterRequestServiceModel2(String shopperId, Boolean otpFlag, String gender, int year, int month, int date, String country) {
        this.shopperId = shopperId;
        this.otpFlag = otpFlag;
        this.gender = gender;
        this.birthDate = new ArrowDate(year, month, date);
        this.country = country;
    }

    public String getShopperId() {
        return shopperId;
    }

    public Boolean getOtpFlag() {
        return otpFlag;
    }

    public String getGender() {
        return gender;
    }

    public ArrowDate getBirthDate() {
        return birthDate;
    }

    public String getCountry() {
        return country;
    }

    @Override
    public String toString() {
        return "RegisterRequestServiceModel2{" +
                "shopperId='" + shopperId + '\'' +
                ", otpFlag=" + otpFlag +
                ", gender='" + gender + '\'' +
                ", birthDate=" + birthDate +
                ", country='" + country + '\'' +
                '}';
    }
}
