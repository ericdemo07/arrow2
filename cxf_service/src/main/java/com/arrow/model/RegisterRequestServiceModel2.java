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

    public RegisterRequestServiceModel2() {
    }

    public RegisterRequestServiceModel2(String shopperId, Boolean otpFlag, String gender, int year, int month, int date) {
        this.shopperId = shopperId;
        this.otpFlag = otpFlag;
        this.gender = gender;
        this.birthDate = new ArrowDate(year, month, date);
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


    @Override
    public String toString() {
        return "RegisterRequestServiceModel2{" +
                "shopperId='" + shopperId + '\'' +
                ", otpFlag=" + otpFlag +
                ", gender='" + gender + '\'' +
                ", birthDate=" + birthDate +
                '}';
    }
}
