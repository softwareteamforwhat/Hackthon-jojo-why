package com.example.hackathon.Controller;

import com.example.hackathon.bl.MissionService;
import com.example.hackathon.vo.MemberMissionForm;
import com.example.hackathon.vo.ResponseVO;
import com.example.hackathon.vo.SubMissionForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/mission")
public class MissionController {
    @Autowired
    private MissionService missionService;

    @PostMapping("/addMain")
    public ResponseVO addMainMission(@RequestParam("mainMission")  String mainMission,@RequestParam("groupId") int groupId){
        return missionService.addMainMission(mainMission,groupId);
    }
    @PostMapping("/addSub")
    public ResponseVO addSubMission(@RequestParam("subMissionForm") SubMissionForm subMissionForm){
        return missionService.addSubMission(subMissionForm);
    }
    @PostMapping("/addMem")
    public ResponseVO addMemberMission(@RequestParam("memberMissionForm") MemberMissionForm memberMissionForm){
        return missionService.addMemberMission(memberMissionForm);
    }
    @PostMapping("/distributeMem")
    public ResponseVO distributeMemberMission(@RequestParam("memberMissionId") int memberMissionId,@RequestParam("userId") int userId){
        return missionService.distributeMemberMission(memberMissionId, userId);
    }
    @PostMapping("/getMain")
    public ResponseVO getMainMission(@RequestParam("groupId") int groupId){
        return missionService.getMainMission(groupId);
    }
    @PostMapping("/getCurrentSub")
    public ResponseVO getSubMission(@RequestParam("groupId") int groupId){
        return missionService.getCurrentSubMission(groupId);
    }
    @PostMapping("/getMem")
    public ResponseVO getMemberMission(@RequestParam("groupId") int groupId,@RequestParam("userId") int userId){
        return missionService.getMemberMission(groupId,userId);
    }
    @PostMapping("/getSubList")
    public ResponseVO getSubMissionList(@RequestParam("groupId") int groupId){
        return missionService.getSubMissionList(groupId);
    }
    @PostMapping("/getMemList")
    public ResponseVO getMemberMissionList(@RequestParam("subMissionId") int subMissionId){
        return missionService.getMemberMissionList(subMissionId);
    }

    @PostMapping("/endMain")
    public ResponseVO endMainMission(@RequestParam("groupId") int groupId){
        return missionService.endMainMission(groupId);
    }
    @PostMapping("/endSub")
    public ResponseVO endSubMission(@RequestParam("groupId") int groupId){
        return missionService.endCurrentSubMission(groupId);
    }
    @PostMapping("/endMem")
    public ResponseVO endMemberMission(@RequestParam("groupId") int groupId,@RequestParam("userId") int userId){
        return missionService.endMemberMission(groupId, userId);
    }


}
