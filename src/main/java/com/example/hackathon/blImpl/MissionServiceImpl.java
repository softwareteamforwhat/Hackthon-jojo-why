package com.example.hackathon.blImpl;


import com.example.hackathon.bl.MissionService;
import com.example.hackathon.data.MemberMissionMapper;
import com.example.hackathon.data.SubMissionMapper;
import com.example.hackathon.data.WorkGroupMapper;
import com.example.hackathon.po.MemberMission;
import com.example.hackathon.po.Mission;
import com.example.hackathon.po.SubMission;
import com.example.hackathon.po.WorkGroup;
import com.example.hackathon.vo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class MissionServiceImpl implements MissionService {
    @Autowired
    WorkGroupMapper workGroupMapper;
    @Autowired
    SubMissionMapper subMissionMapper;
    @Autowired
    MemberMissionMapper memberMissionMapper;
    @Override
    public ResponseVO addMainMission(String mainmission,int groupId) {
        try {
            WorkGroup workGroup=workGroupMapper.getWorkGroupByGroupId(groupId);
            workGroupMapper.updateWorkGroup(groupId,workGroup.getGroupname(),mainmission);
            return ResponseVO.buildSuccess();
        }catch (Exception e){
            return ResponseVO.buildFailure("");
        }
    }

    @Override
    public ResponseVO addSubMission(SubMissionForm submissionForm) {
        try {
            SubMission subMission = new SubMission();
            setMission(subMission, submissionForm);
            subMissionMapper.insertSubMission(subMission);
            return ResponseVO.buildSuccess();
        }catch (Exception e){
            return ResponseVO.buildFailure("");
        }

    }

    @Override
    public ResponseVO addMemberMission(MemberMissionForm memberMissionForm) {
        try {
            MemberMission memberMission = new MemberMission();
            memberMission.setName(memberMissionForm.getName());
            memberMission.setDescription(memberMissionForm.getDescription());
            memberMission.setStarttime(memberMissionForm.getStarttime());
            memberMission.setEndtime(memberMissionForm.getEndtime());
            memberMissionMapper.insertMemberMission(memberMission);
            return ResponseVO.buildSuccess();
        }catch (Exception e){
            return ResponseVO.buildFailure("");
        }
    }

    @Override
    public ResponseVO distributeMemberMission(int MemberMissionId, int userId) {
        try {
            memberMissionMapper.distribute(userId,MemberMissionId);
            return ResponseVO.buildSuccess();
        }catch (Exception e){
            return ResponseVO.buildFailure("");
        }
    }

    private void setMission(Mission mission, MissionForm missionForm){
        mission.setName(missionForm.getName());
        mission.setGroupId(missionForm.getGroupId());
        mission.setDescription(missionForm.getDescription());
        mission.setStarttime(missionForm.getStarttime());
        mission.setEndtime(missionForm.getEndtime());

    }

    @Override
    public ResponseVO getMainMission(int groupId) {
        try{
            WorkGroup workGroup=workGroupMapper.getWorkGroupByGroupId(groupId);
            return ResponseVO.buildSuccess(workGroup.getMainMission());

        }catch (Exception e){
            return ResponseVO.buildFailure("");
        }

    }

    @Override
    public ResponseVO getCurrentSubMission(int groupId) {
        try{
            SubMission subMission=subMissionMapper.selectSubMissionById(workGroupMapper.getWorkGroupByGroupId(groupId).getCurrentSubmissionId());
            return ResponseVO.buildSuccess(subMission.getForm());
        }catch (Exception e){
            return ResponseVO.buildFailure("");
        }
    }

    @Override
    public ResponseVO getMemberMission(int groupId, int userId) {
        try{
            SubMission currentSubMission=subMissionMapper.selectSubMissionById(workGroupMapper.getWorkGroupByGroupId(groupId).getCurrentSubmissionId());
            MemberMission memberMission=memberMissionMapper.selectMemberMissionBySubIdAndUserId(currentSubMission.getId(),userId);
            return ResponseVO.buildSuccess(memberMission.getForm());
        }catch (Exception e){
            return ResponseVO.buildFailure("");
        }
    }

    @Override
    public ResponseVO getSubMissionList(int groupId) {
        try{
            List<SubMission> subMissionList=subMissionMapper.selectSubMissionlistByGroupId(groupId);
            List<SubMissionForm> subMissionFormList=new ArrayList<>();
            for(SubMission subMission:subMissionList){
                subMissionFormList.add(subMission.getForm());
            }
            return ResponseVO.buildSuccess(subMissionFormList);
        }catch (Exception e){
            return ResponseVO.buildFailure("");
        }
    }

    @Override
    public ResponseVO getMemberMissionList(int subMissionId) {
        try{
            List<MemberMission> memberMissionlist=memberMissionMapper.selectMemberMissionListBySubId(subMissionId);
            List<MemberMissionForm> memberMissionFormList=new ArrayList<>();
            for(MemberMission memberMission:memberMissionlist){
                memberMissionFormList.add(memberMission.getForm());
            }
            return ResponseVO.buildSuccess(memberMissionFormList);
        }catch (Exception e){
            return ResponseVO.buildFailure("");
        }
    }




    @Override
    public ResponseVO endMainMission(int groupId) {
        try{
            workGroupMapper.updateStatus(groupId);
            return ResponseVO.buildFailure("");
        }catch (Exception e){
            return ResponseVO.buildFailure("");
        }
    }

    @Override
    public ResponseVO endCurrentSubMission(int groupId) {
        try {
            SubMission currentSubMission = subMissionMapper.selectSubMissionById(workGroupMapper.getWorkGroupByGroupId(groupId).getCurrentSubmissionId());
            return ResponseVO.buildSuccess();
        }catch (Exception e){
            return ResponseVO.buildFailure("");
        }
    }

    @Override
    public ResponseVO endMemberMission(int groupId, int userId) {
        try{
            SubMission currentSubMission=subMissionMapper.selectSubMissionById(workGroupMapper.getWorkGroupByGroupId(groupId).getCurrentSubmissionId());
            MemberMission memberMission=memberMissionMapper.selectMemberMissionBySubIdAndUserId(currentSubMission.getId(),userId);
            return ResponseVO.buildSuccess();
        }catch (Exception e){
            return ResponseVO.buildFailure("");
        }
    }


}
