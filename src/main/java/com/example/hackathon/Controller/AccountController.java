package com.example.hackathon.Controller;

import com.example.hackathon.blImpl.AccountServiceImpl;
import com.example.hackathon.config.InterceptorConfiguration;
import com.example.hackathon.vo.ResponseVO;
import com.example.hackathon.vo.UserForm;
import com.example.hackathon.vo.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

@RestController
public class AccountController {
    //registerAccount
    private final static String ACCOUNT_INFO_ERROR="用户名或密码错误";
    @Autowired
    private AccountServiceImpl accountService;
    @PostMapping("/login")
    public ResponseVO login(@RequestParam("username")String username,@RequestParam("password") String password, HttpSession session){
        System.out.println("username:"+username);
        System.out.println("password:"+password);
        UserForm userForm=new UserForm(username,password);
        UserVO user = accountService.login(userForm);
        if(user==null){
            System.out.println("user为空");
            return ResponseVO.buildFailure(ACCOUNT_INFO_ERROR);
        }
        //注册session
        session.setAttribute(InterceptorConfiguration.SESSION_KEY,userForm);

        return ResponseVO.buildSuccess(user);
    }
    @PostMapping("/register")
    public ResponseVO registerAccount(@RequestParam("username") String username,@RequestParam("password") String password){
        System.out.println(username+":"+password);
        UserForm userForm=new UserForm(username,password);
        return accountService.registerAccount(userForm);
    }

    @PostMapping("/logout")
    public String logOut(HttpSession session){
        session.removeAttribute(InterceptorConfiguration.SESSION_KEY);
        return "index";
    }
}
