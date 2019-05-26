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
    int createNewWorkGroup(@Param("leader_id")Integer leader_id,@Param("groupname") String groupname,@Param("main_mission")String main_mission);

    /**
     * 修改group的信息(仅限队长)
     * @param lead_id,groupname,main_mission,status
     */
    void updateWorkGroup(@Param("lead_id") Integer lead_id,@Param("groupname") String groupname,@Param("main_mission")String main_mission,@Param("status")Integer status);

    /**
     * 用groupId获取group信息
     * @param groupId
     * @return WorkGroup
     */
    WorkGroup getWorkGroupByGroupId(@Param("groupId")Integer groupId);

}
