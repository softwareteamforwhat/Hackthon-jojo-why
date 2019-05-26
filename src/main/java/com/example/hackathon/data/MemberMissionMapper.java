package com.example.hackathon.data;

import com.example.hackathon.po.MemberMission;

public interface MemberMissionMapper {
    /**
     * 根据groupId查找对应的MemberMission
     * @param groupId
     * @return MemberMission
     */
    MemberMission selectMainMissionByGroupId(int groupId);

    void insertMemberMission(MemberMission memberMission);

    /**
     * 根据MemberMission的Id查找对应的MemberMission
     * @param Id
     * @return
     */
    MemberMission selectMemberMissionById(int Id);
}
