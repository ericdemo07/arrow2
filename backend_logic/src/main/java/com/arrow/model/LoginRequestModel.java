package com.arrow.model;

/**
 * Created by ayush.shukla on 10/6/2016.
 */
public class LoginRequestModel {
    private String username;
    private String password;
    private Boolean flagEnabled;
    private int role;

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }

    public LoginRequestModel(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public Boolean getFlagEnabled() {
        return flagEnabled;
    }

    public void setFlagEnabled(Boolean flagEnabled) {
        this.flagEnabled = flagEnabled;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "LoginRequestModel{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}