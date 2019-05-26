package com.example.hackathon.blImpl;

import com.example.hackathon.bl.AccountService;
import com.example.hackathon.data.AccountMapper;
import com.example.hackathon.po.User;
import com.example.hackathon.vo.ResponseVO;
import com.example.hackathon.vo.UserForm;
import com.example.hackathon.vo.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountMapper accountMapper;
    @Override
    public ResponseVO registerAccount(UserForm userForm) {
        System.out.println(userForm.getPassword()+":"+userForm.getUsername());

            accountMapper.createNewAccount(userForm.getUsername(), userForm.getPassword());

        //    return ResponseVO.buildFailure("错误，账号已存在！");

        return ResponseVO.buildSuccess();
    }

    @Override
    public UserVO login(UserForm userForm) {
        User user = accountMapper.getAccountByName(userForm.getUsername());
        System.out.println("userForm.getUsername():"+userForm.getUsername());
        if(user==null){
            System.out.println("null");
            return new UserVO(userForm);
        }
        System.out.println(user.getPassword()+":"+userForm.getPassword());

        if (null == user || !user.getPassword().equals(userForm.getPassword())) {
            return null;
        }

        return new UserVO(userForm);
    }
}
