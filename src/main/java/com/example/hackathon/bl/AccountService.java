package com.example.hackathon.bl;


import com.example.hackathon.vo.ResponseVO;
import com.example.hackathon.vo.UserForm;
import com.example.hackathon.vo.UserVO;

public interface AccountService {
    public ResponseVO registerAccount(UserForm userForm);//注册
    public UserVO login(UserForm userForm);//登录

}
