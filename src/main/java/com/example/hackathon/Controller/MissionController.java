package com.example.hackathon.Controller;

import com.example.hackathon.bl.MissionService;
import com.example.hackathon.vo.MemberMissionForm;
import com.example.hackathon.vo.ResponseVO;
import com.example.hackathon.vo.SubMissionForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/mission")
public class MissionController {
    @Autowired
    private MissionService missionService;

    @PostMapping("/addMain")
    public ResponseVO addMainMission(@RequestBody  String mainMission,@RequestBody int groupId){
        return missionService.addMainMission(mainMission,groupId);
    }
    @PostMapping("/addSub")
    public ResponseVO addSubMission(@RequestBody SubMissionForm subMissionForm){
        return missionService.addSubMission(subMissionForm);
    }
    @PostMapping("/addMem")
    public ResponseVO addMemberMission(@RequestBody MemberMissionForm memberMissionForm){
        return missionService.addMemberMission(memberMissionForm);
    }
    @PostMapping("/getMain")
    public ResponseVO getMainMission(@RequestBody int groupId){
        return missionService.getMainMission(groupId);
    }
    @PostMapping("/getCurrentSub")
    public ResponseVO getSubMission(@RequestBody int groupId){
        return missionService.getCurrentSubMission(groupId);
    }
    @PostMapping("/getMem")
    public ResponseVO getMemberMission(@RequestBody int groupId,@RequestBody int userId){
        return missionService.getMemberMission(groupId,userId);
    }
    @PostMapping("/getSubList")
    public ResponseVO getSubMissionList(@RequestBody int groupId){
        return missionService.getSubMissionList(groupId);
    }
    @PostMapping("/getMemList")
    public ResponseVO getMemberMissionList(@RequestBody int SubMissionId){
        return missionService.getMemberMissionList(SubMissionId);
    }

    @PostMapping("/endMain")
    public ResponseVO endMainMission(@RequestBody int groupId){
        return missionService.endMainMission(groupId);
    }
    @PostMapping("/endSub")
    public ResponseVO endSubMission(@RequestBody int groupId){
        return missionService.endCurrentSubMission(groupId);
    }
    @PostMapping("/endMem")
    public ResponseVO endMemberMission(@RequestBody int groupId,@RequestBody int userId){
        return missionService.endMemberMission(groupId, userId);
    }


}
