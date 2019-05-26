package com.example.hackathon.data;

import com.example.hackathon.po.User;
import org.apache.ibatis.annotations.Param;

public interface AccountMapper {
    public int createNewAccount(@Param("username") String username, @Param("password") String password);
    public User getAccountByName(@Param("username") String username);
}
