package com.example.hackathon.data;

import com.example.hackathon.po.SubMission;

public interface SubMissionMapper {
    /**
     * 根据groupId查找对应的SubMission
     * @param groupId
     * @return SubMission
     */
    SubMission selectSubMissionByGroupId(int groupId);

    void insertSubMission(SubMission SubMission);

    /**
     * 根据SubMission的Id查找对应的SubMission
     * @param Id
     * @return
     */
    SubMission selectSubMissionById(int Id);
}
