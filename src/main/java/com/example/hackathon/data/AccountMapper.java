package com.example.hackathon.data;

import com.example.hackathon.po.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface AccountMapper {

    int createNewAccount(@Param("username") String username, @Param("password") String password);

    User getAccountByName(@Param("username") String username);
}
