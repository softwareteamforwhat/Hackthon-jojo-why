package com.example.hackathon.bl;


import com.example.hackathon.vo.ResponseVO;
import com.example.hackathon.vo.UserForm;
import com.example.hackathon.vo.UserVO;

public interface AccountService {
     /**
      * 注册
      * @param userForm
      * @return
      */
     ResponseVO registerAccount(UserForm userForm);

     /**
      * 登陆
      * @param userForm
      * @return
      */
     UserVO login(UserForm userForm);

}
