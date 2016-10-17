package com.arrow.model;

import com.arrow.internal.datastructure.ArrowPhone;

/**
 * Created by ayush.shukla on 10/6/2016.
 */
public class RegisterRequestServiceModel1 {
    private String username;
    private String mailId;
    private ArrowPhone phone;
    private String password;

    public RegisterRequestServiceModel1() {
    }

    public RegisterRequestServiceModel1(String username, String mailId, String phone, String password) {
        this.username = username;
        this.mailId = mailId;
        this.phone = new ArrowPhone(phone);
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getMailId() {
        return mailId;
    }

    public ArrowPhone getPhone() {
        return phone;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "RegisterRequestServiceModel1{" +
                "username='" + username + '\'' +
                ", mailId='" + mailId + '\'' +
                ", phone=" + phone +
                ", password='" + password + '\'' +
                '}';
    }
}
