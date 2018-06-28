package com.betteryanwo.entity;

import java.sql.Timestamp;

public class Users {
    private Long userId;
    private String userName;
    private String realName;
    private String userSex;
    private String userPassword;
    private String email;
    private String phone;
    private String cardId;
    private Timestamp regTime;
    private Long integral;
    private Long gradeId;

    public Users() {
    }

    public Users(Long userId, String userName, String realName,
                 String userSex, String userPassword, String email,
                 String phone, String cardId, Timestamp regTime,
                 Long integral, Long gradeId) {
        this.userId = userId;
        this.userName = userName;
        this.realName = realName;
        this.userSex = userSex;
        this.userPassword = userPassword;
        this.email = email;
        this.phone = phone;
        this.cardId = cardId;
        this.regTime = regTime;
        this.integral = integral;
        this.gradeId = gradeId;
    }

    public Long getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public String getRealName() {
        return realName;
    }

    public String getUserSex() {
        return userSex;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getCardId() {
        return cardId;
    }

    public Timestamp getRegTime() {
        return regTime;
    }

    public Long getIntegral() {
        return integral;
    }

    public Long getGradeId() {
        return gradeId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public void setUserSex(String userSex) {
        this.userSex = userSex;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public void setRegTime(Timestamp regTime) {
        this.regTime = regTime;
    }

    public void setIntegral(Long integral) {
        this.integral = integral;
    }

    public void setGradeId(Long gradeId) {
        this.gradeId = gradeId;
    }
}
