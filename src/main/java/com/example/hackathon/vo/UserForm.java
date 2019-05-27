package com.example.hackathon.vo;

import com.example.hackathon.po.User;

public class UserForm {
    public UserForm(String username, String password) {
        this.username=username;
        this.password=password;
    }

    public UserForm(User user){
        this.userId=user.getId();
        this.username=user.getUsername();
        this.password=user.getPassword();
    }


    private int userId;

    private String username;

    private String password;

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

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

}
