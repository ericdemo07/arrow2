package com.arrow.model;

/**
 * Created by ayush.shukla on 10/6/2016.
 */
public class LoginRequestServiceModel {
    private String username;
    private String password;

    public LoginRequestServiceModel() {
    }

    public LoginRequestServiceModel(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "LoginRequestServiceModel{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
