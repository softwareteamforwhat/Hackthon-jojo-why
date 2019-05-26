package com.example.hackathon.blImpl;


import com.example.hackathon.bl.MissionService;
import com.example.hackathon.data.MainMissionMapper;
import com.example.hackathon.vo.MainMissionForm;
import com.example.hackathon.vo.MemberMissionForm;
import com.example.hackathon.vo.ResponseVO;
import com.example.hackathon.vo.SubMissionForm;
import org.springframework.beans.factory.annotation.Autowired;

public class MissionServiceImpl implements MissionService {
    @Autowired
    MainMissionMapper missionMapper;
    @Override
    public ResponseVO addMainMission(MainMissionForm mainmissionForm) {

        return null;
    }

    @Override
    public ResponseVO addSubMission(SubMissionForm submissionForm) {
        return null;
    }

    @Override
    public ResponseVO addMemberMission(MemberMissionForm memberMissionForm) {
        return null;
    }

    @Override
    public ResponseVO getMainMission(int groupId) {
        return null;
    }

    @Override
    public ResponseVO getCurrentSubMission(int groupId) {
        return null;
    }

    @Override
    public ResponseVO getMemberMission(int groupId, int userId) {
        return null;
    }

    @Override
    public ResponseVO getSubMissionList(int groupId) {
        return null;
    }

    @Override
    public ResponseVO getMemberMissionList(int groupId, int subMissionId) {
        return null;
    }

    @Override
    public ResponseVO endMainMission(int groupId) {
        return null;
    }

    @Override
    public ResponseVO endCurrentSubMission(int groupId) {
        return null;
    }

    @Override
    public ResponseVO endMemberMission(int groupId, int userId) {
        return null;
    }


}
