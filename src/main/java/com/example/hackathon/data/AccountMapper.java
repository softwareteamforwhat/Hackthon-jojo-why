package com.example.hackathon.data;

import com.example.hackathon.po.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.RequestParam;

@Mapper
public interface AccountMapper {

    /**
     * 创建新用户
     * @param username,password
     * @return userId
     */
    int createNewAccount(@Param("username") String username, @Param("password") String password);

    /**
     * 以用户名搜索用户
     * @param username
     * @return User
     */
    User getAccountByName(@Param("username") String username);
}
