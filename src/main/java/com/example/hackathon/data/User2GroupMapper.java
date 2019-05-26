package com.example.hackathon.data;

import com.example.hackathon.po.User;
import com.example.hackathon.po.WorkGroup;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface User2GroupMapper {
    /**
     * 获取某组的成员Id
     * @param groupId
     * @return List<Integer> (内含useId)
     */
    List<Integer> getUserByGroup(@Param("groupId") Integer groupId);

    /**
     * 根据userId 获取User对象
     * @param userId
     * @Return User
     */
    User getUserByUserId(@Param("userId")Integer userId);

    /**
     * 获取某用户所参加的组的groupId
     * @param userId
     * @return List<Integer>(内含groupId)
     */
    List<Integer> getGroupIdByUserId(@Param("userId") Integer userId);
    /**
     * 获取对应groupId的workgroup
     */
    WorkGroup getGroupByGroupId(@Param("groupId")Integer groupId);

    /**
     * 用户加入某组
     * @param userId,gou
     */

    void userJoinGroup(@Param("userId") Integer userId,@Param("groupId") Integer groupId);

    /**
     * 用户退出某组
     * @param userId,
     */
    void userExitGroup(@Param("userId")Integer userId,@Param("groupId")Integer groupId);
}
