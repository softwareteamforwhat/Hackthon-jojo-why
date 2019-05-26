package com.example.hackathon.data;

import com.example.hackathon.po.SubMission;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface SubMissionMapper {
    /**
     * 根据groupId查找对应的list<SubMission>
     * @param groupId
     * @return SubMission
     */
    List<SubMission> selectSubMissionlistByGroupId(@Param("groupId") int groupId);

    void insertSubMission(@Param("subMission") SubMission subMission);

    /**
     * 根据SubMission的Id查找对应的SubMission
     * @param Id
     * @return
     */
    SubMission selectSubMissionById(@Param("Id") int Id);

    /**
     * 根据ID将某一个SubMission的状态改为已完成
     * 成功则返回true，失败返回false
     */
    boolean end(@Param("subMissionId") int subMissionId);
}
