package com.example.hackathon.data;

import com.example.hackathon.po.User;
import com.example.hackathon.po.WorkGroup;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface User2GroupMapper {

    List<User> getUserByGroup(@Param("groupId") Integer groupId);

    List<WorkGroup> getGroupByUser(@Param("userId") Integer userId);
}
