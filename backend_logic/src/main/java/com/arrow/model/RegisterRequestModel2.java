package com.arrow.model;

/**
 * Created by ayush.shukla on 10/18/2016.
 */
public class RegisterRequestModel2 {

    private String shopperId;
    private String userName;
    private String mailId;
    private String isdCode;
    private String countryCode;
    private String countryName;
    private Long phone;
    private char gender;
    private int birthYear;
    private char birthMonth;
    private char birthDate;
    private Boolean flagEnabled;

    public RegisterRequestModel2(String shopperId, String userName, String mailId, String isdCode, String countryCode, String countryName, Long phone, char gender, int birthYear, char birthMonth, char birthDate, Boolean flagEnabled) {
        this.shopperId = shopperId;
        this.userName = userName;
        this.mailId = mailId;
        this.isdCode = isdCode;
        this.countryCode = countryCode;
        this.countryName = countryName;
        this.phone = phone;
        this.gender = gender;
        this.birthYear = birthYear;
        this.birthMonth = birthMonth;
        this.birthDate = birthDate;
        this.flagEnabled = flagEnabled;
    }

    public String getShopperId() {
        return shopperId;
    }

    public void setShopperId(String shopperId) {
        this.shopperId = shopperId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getMailId() {
        return mailId;
    }

    public void setMailId(String mailId) {
        this.mailId = mailId;
    }

    public String getIsdCode() {
        return isdCode;
    }

    public void setIsdCode(String isdCode) {
        this.isdCode = isdCode;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public Long getPhone() {
        return phone;
    }

    public void setPhone(Long phone) {
        this.phone = phone;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public char getBirthMonth() {
        return birthMonth;
    }

    public void setBirthMonth(char birthMonth) {
        this.birthMonth = birthMonth;
    }

    public char getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(char birthDate) {
        this.birthDate = birthDate;
    }


    public Boolean getFlagEnabled() {
        return flagEnabled;
    }

    public void setFlagEnabled(Boolean flagEnabled) {
        this.flagEnabled = flagEnabled;
    }
    
    @Override
    public String toString() {
        return "RegisterRequestModel2{" +
                "shopperId='" + shopperId + '\'' +
                ", userName='" + userName + '\'' +
                ", mailId='" + mailId + '\'' +
                ", isdCode='" + isdCode + '\'' +
                ", countryCode='" + countryCode + '\'' +
                ", countryName='" + countryName + '\'' +
                ", phone=" + phone +
                ", gender=" + gender +
                ", birthYear=" + birthYear +
                ", birthMonth=" + birthMonth +
                ", birthDate=" + birthDate +
                ", flagEnabled=" + flagEnabled +
                '}';
    }
}
