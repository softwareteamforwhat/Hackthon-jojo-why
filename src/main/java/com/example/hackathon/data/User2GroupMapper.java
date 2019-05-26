package com.example.hackathon.data;

import com.example.hackathon.po.User;
import com.example.hackathon.po.WorkGroup;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface User2GroupMapper {
    /**
     * 获取某组的成员
     * @param groupId
     * @return List<User>
     */
    List<User> getUserByGroup(@Param("groupId") Integer groupId);

    /**
     * 获取某用户所参加的组
     * @param userId
     * @return List<WorkGroup>
     */
    List<WorkGroup> getGroupByUser(@Param("userId") Integer userId);
}
