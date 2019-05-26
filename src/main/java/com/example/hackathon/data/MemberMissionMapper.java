package com.example.hackathon.data;

import com.example.hackathon.po.MemberMission;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface MemberMissionMapper {
    /**
     * 根据SubMissionId和userId查找对应的MemberMission
     * @param subMissionId,
     * @param userId
     * @return MemberMission
     */
    MemberMission selectMemberMissionBySubIdAndUserId(@Param("subMissionId") int subMissionId, @Param("userId") int userId);



    void insertMemberMission(@Param("memberMission") MemberMission memberMission);

    /**
     * 根据MemberMission的Id查找对应的MemberMission
     * @param Id
     * @return
     */
    MemberMission selectMemberMissionById(@Param("Id") int Id);

    /**
     * 根据某一个SubMissionId返回其对应的MemberMission的list
     */
    List<MemberMission> selectMemberMissionListBySubId(@Param("subMissionId") int subMissionId);

    /**
     * 根据Id将某一个memberMission的状态改为已完成
     *成功则返回true，失败返回false
     */
    void end(@Param("memberMissionId") int memberMissionId);

    /**
     * 将某个membermission的own_id 改为指定user的id
     */
    void distribute(@Param("userId")Integer userId,@Param("memberMissionId")Integer memberMissionId);
}
