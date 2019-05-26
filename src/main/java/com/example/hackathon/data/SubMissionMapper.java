package com.example.hackathon.data;

import com.example.hackathon.po.SubMission;

import java.util.List;

public interface SubMissionMapper {
    /**
     * 根据groupId查找对应的list<SubMission>
     * @param groupId
     * @return SubMission
     */
    List<SubMission> selectSubMissionlistByGroupId(int groupId);

    void insertSubMission(SubMission SubMission);

    /**
     * 根据SubMission的Id查找对应的SubMission
     * @param Id
     * @return
     */
    SubMission selectSubMissionById(int Id);

    /**
     * 根据ID将某一个SubMission的状态改为已完成
     * 成功则返回true，失败返回false
     */
    boolean end(int subMissionId);
}
