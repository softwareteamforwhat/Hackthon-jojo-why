package com.example.hackathon.bl;

import com.example.hackathon.vo.MainMissionForm;
import com.example.hackathon.vo.MemberMissionForm;
import com.example.hackathon.vo.ResponseVO;
import com.example.hackathon.vo.SubMissionForm;


public interface MissionService {
    /*
    发布任务
     */
    /**
     * @param mainmissionForm
     * @return
     */
    ResponseVO addMainMission(MainMissionForm mainmissionForm);

    ResponseVO addSubMission(SubMissionForm submissionForm);
    ResponseVO addMemberMission(MemberMissionForm memberMissionForm);

    /**
     获取任务信息
     */
    ResponseVO getMainMission(int groupId);
    ResponseVO getCurrentSubMission(int groupId);//返回当前子任务
    ResponseVO getMemberMission(int groupId,int userId);//返回某个成员的当前成员任务

    ResponseVO getSubMissionList(int groupId);//返回该组所有已经发布过的子任务列表
    ResponseVO getMemberMissionList(int groupId,int subMissionId);//返回某一个子任务的成员任务列表

    /**
    结束任务
     */
    ResponseVO endMainMission(int groupId);
    ResponseVO endCurrentSubMission(int groupId);
    ResponseVO endMemberMission(int groupId,int userId);


}
