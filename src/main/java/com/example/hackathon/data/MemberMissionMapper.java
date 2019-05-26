package com.example.hackathon.data;

import com.example.hackathon.po.MemberMission;

import java.util.List;

public interface MemberMissionMapper {
    /**
     * 根据SubMissionId和userId查找对应的MemberMission
     * @param subMissionId,
     * @param userId
     * @return MemberMission
     */
    MemberMission selectMemberMissionBySubIdAndUserId(int subMissionId,int userId);

    void insertMemberMission(MemberMission memberMission);

    /**
     * 根据MemberMission的Id查找对应的MemberMission
     * @param Id
     * @return
     */
    MemberMission selectMemberMissionById(int Id);

    /**
     * 根据某一个SubMissionId返回其对应的MemberMission的list
     */
    List<MemberMission> selectMemberMissionListBySubId(int subMissionId);

    /**
     * 根据Id将某一个memberMission的状态改为已完成
     *成功则返回true，失败返回false
     */
    boolean end(int memberMissionId);
}
