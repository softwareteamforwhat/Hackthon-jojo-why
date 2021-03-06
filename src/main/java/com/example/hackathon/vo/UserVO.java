package com.example.hackathon.vo;

import com.example.hackathon.po.User;

public class UserVO {
    private Integer id;
    private String username;
    private String password;

    public UserVO(UserForm userForm){
        this.id = userForm.getUserId();
        this.username = userForm.getUsername();
        this.password = userForm.getPassword();
    }
    public UserVO(User user){
        this.id=user.getId();
        this.username=user.getUsername();
        this.password=user.getPassword();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
}
