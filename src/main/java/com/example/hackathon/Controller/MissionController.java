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
    public ResponseVO addMainMission(@RequestParam("mainMission")  String mainMission,@RequestParam("groupId") String groupId){
        return missionService.addMainMission(mainMission,Integer.parseInt(groupId));
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
    public ResponseVO distributeMemberMission(@RequestParam("memberMissionId") String memberMissionId,@RequestParam("userId") String userId){
        return missionService.distributeMemberMission(Integer.parseInt(memberMissionId), Integer.parseInt(userId));
    }
    @PostMapping("/getMain")
    public ResponseVO getMainMission(@RequestParam("groupId") String groupId){
        return missionService.getMainMission(Integer.parseInt(groupId));
    }
    @PostMapping("/getCurrentSub")
    public ResponseVO getSubMission(@RequestParam("groupId") String groupId){
        return missionService.getCurrentSubMission(Integer.parseInt(groupId));
    }
    @PostMapping("/getMem")
    public ResponseVO getMemberMission(@RequestParam("groupId") String groupId,@RequestParam("userId") String userId){
        return missionService.getMemberMission(Integer.parseInt(groupId),Integer.parseInt(userId));
    }
    @PostMapping("/getSubList")
    public ResponseVO getSubMissionList(@RequestParam("groupId") String groupId){
        return missionService.getSubMissionList(Integer.parseInt(groupId));
    }
    @PostMapping("/getMemList")
    public ResponseVO getMemberMissionList(@RequestParam("subMissionId") String subMissionId){
        return missionService.getMemberMissionList(Integer.parseInt(subMissionId));
    }

    @PostMapping("/endMain")
    public ResponseVO endMainMission(@RequestParam("groupId") String groupId){
        return missionService.endMainMission(Integer.parseInt(groupId));
    }
    @PostMapping("/endSub")
    public ResponseVO endSubMission(@RequestParam("groupId") String groupId){
        return missionService.endCurrentSubMission(Integer.parseInt(groupId));
    }
    @PostMapping("/endMem")
    public ResponseVO endMemberMission(@RequestParam("groupId") String groupId,@RequestParam("userId") String userId) {
        return missionService.endMemberMission(Integer.parseInt(groupId), Integer.parseInt(userId));
    }

}
