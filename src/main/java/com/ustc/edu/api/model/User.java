package com.ustc.edu.api.model;

import javax.persistence.*;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "userId", unique = true, nullable = false)
    private Integer userId;
    private String userName;
    private String userEmail;
    private String userPassword;
    private String userPhone;

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public void setPassword(String password) {
        this.userPassword = password;
    }

    public void setPhone(String phone) {
        this.userPhone = phone;
    }

    public Integer getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public String getPassword() {
        return userPassword;
    }

    public String getPhone() {
        return userPhone;
    }
}
