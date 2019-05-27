package com.example.hackathon.Controller;

import com.example.hackathon.bl.WorkGroupService;
import com.example.hackathon.data.User2GroupMapper;
import com.example.hackathon.vo.ResponseVO;
import com.example.hackathon.vo.UserForm;
import com.example.hackathon.vo.WorkGroupForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class WorkGroupController {
    @Autowired
    private WorkGroupService workGroupService;

    @RequestMapping(value = "/work_group/add", method = RequestMethod.POST)
    public ResponseVO addWorkGroup(@RequestParam("groupId") String groupId,@RequestParam("UserId") String userId,@RequestParam("groupName") String groupName,@RequestParam("mainMission") String mainMission){
        return workGroupService.addWorkGroup(Integer.parseInt(groupId),Integer.parseInt(userId),groupName,mainMission);
    }
    @RequestMapping(value = "/work_group/all", method = RequestMethod.POST)
    public ResponseVO getWorkGroupById(@RequestParam("userId") String id){
        return workGroupService.getWorkGroupById(Integer.parseInt(id));
    }

    @RequestMapping(value = "/work_group/off",method = RequestMethod.POST)
    public ResponseVO removeGroup(@RequestParam("groupId") String id){
        return workGroupService.removeWorkGroup(Integer.parseInt(id));
    }

    @RequestMapping(value = "/work_group/update",method = RequestMethod.POST)
    public ResponseVO updateGroup(@RequestParam("groupId") String groupId,@RequestParam("UserId") String userId,@RequestParam("groupName") String groupName,@RequestParam("mainMission") String mainMission){
        return workGroupService.updateWorkGroup(Integer.parseInt(groupId),Integer.parseInt(userId),groupName,mainMission);
    }
    @RequestMapping(value = "/work_group/add_member",method = RequestMethod.POST)
    public ResponseVO addMember(@RequestParam("userId") String userId,@RequestParam("groupId") String  groupId){
        return workGroupService.addMember(Integer.parseInt(userId),Integer.parseInt(groupId));
    }
}
