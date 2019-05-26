package com.example.hackathon.data;

import com.example.hackathon.po.WorkGroup;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;


@Mapper
public interface WorkGroupMapper {
    /**
     * 用队长的id创建组
     * @param leader_id,groupname,man_mission
     * @return groupId
     */
    int createNewWorkGroup(@Param("leader_id")Integer leader_id, @Param("groupname") String groupname, @Param("main_mission")String main_mission);

    /**
     * 修改group的信息(仅限队长)
     * @param groupId,groupname,main_mission
     */
    void updateWorkGroup(@Param("groupId") Integer groupId,@Param("groupname") String groupname,@Param("main_mission")String main_mission);


    /**
     * 更改group状态为已完成
     * @param groupId
     */
    void updateStatus(@Param("groupId")Integer groupId);

    /**
     * 用groupId获取group信息
     * @param groupId
     * @return WorkGroup
     */
    WorkGroup getWorkGroupByGroupId(@Param("groupId")Integer groupId);


}
