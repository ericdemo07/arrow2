package com.arrow.model;

import com.arrow.internal.datastructure.ArrowPhone;

/**
 * Created by ayush.shukla on 10/18/2016.
 */
public class RegisterRequestModel1 {
    private String username;
    private String mailId;
    private ArrowPhone arrowPhone;
    private String password;
    private String otp;

    public RegisterRequestModel1(String username, String mailId, ArrowPhone arrowPhone, String password) {
        this.username = username;
        this.mailId = mailId;
        this.arrowPhone = arrowPhone;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getMailId() {
        return mailId;
    }

    public void setMailId(String mailId) {
        this.mailId = mailId;
    }

    public ArrowPhone getArrowPhone() {
        return arrowPhone;
    }

    public void setArrowPhone(ArrowPhone arrowPhone) {
        this.arrowPhone = arrowPhone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getOtp() {
        return otp;
    }

    public void setOtp(String otp) {
        this.otp = otp;
    }

    @Override
    public String toString() {
        return "RegisterRequestModel1{" +
                "username='" + username + '\'' +
                ", mailId='" + mailId + '\'' +
                ", arrowPhone=" + arrowPhone +
                ", password='" + password + '\'' +
                '}';
    }
}
