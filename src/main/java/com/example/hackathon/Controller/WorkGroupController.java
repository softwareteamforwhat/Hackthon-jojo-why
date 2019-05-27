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
    public ResponseVO addWorkGroup(@RequestParam("groupId") int groupId,@RequestParam("UserId") int userId,@RequestParam("groupName") String groupName,@RequestParam("mainMission") String mainMission){
        return workGroupService.addWorkGroup(groupId,userId,groupName,mainMission);
    }
    @RequestMapping(value = "/work_group/all", method = RequestMethod.POST)
    public ResponseVO getWorkGroupById(@RequestParam("userId") int id){
        return workGroupService.getWorkGroupById(id);
    }

    @RequestMapping(value = "/work_group/off",method = RequestMethod.POST)
    public ResponseVO removeGroup(@RequestParam("groupId") int id){
        return workGroupService.removeWorkGroup(id);
    }

    @RequestMapping(value = "/work_group/update",method = RequestMethod.POST)
    public ResponseVO updateGroup(@RequestParam("groupId") int groupId,@RequestParam("UserId") int userId,@RequestParam("groupName") String groupName,@RequestParam("mainMission") String mainMission){
        return workGroupService.updateWorkGroup(groupId,userId,groupName,mainMission);
    }
    @RequestMapping(value = "/work_group/add_member",method = RequestMethod.POST)
    public ResponseVO addMember(@RequestParam("userId") int userId,@RequestParam("groupId") int  groupId){
        return workGroupService.addMember(userId,groupId);
    }
}
