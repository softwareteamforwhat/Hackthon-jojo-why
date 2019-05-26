package com.example.hackathon.Controller;

import com.example.hackathon.bl.WorkGroupService;
import com.example.hackathon.data.User2GroupMapper;
import com.example.hackathon.vo.ResponseVO;
import com.example.hackathon.vo.UserForm;
import com.example.hackathon.vo.WorkGroupForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WorkGroupController {
    @Autowired
    private WorkGroupService workGroupService;

    @RequestMapping(value = "/work_group/add", method = RequestMethod.POST)
    public ResponseVO addWorkGroup(@RequestBody WorkGroupForm workGroupForm){
        return workGroupService.addWorkGroup(workGroupForm);
    }
    @RequestMapping(value = "/work_group/all", method = RequestMethod.POST)
    public ResponseVO getWorkGroupById(@RequestBody int id){
        return workGroupService.getWorkGroupById(id);
    }

    @RequestMapping(value = "/work_group/off",method = RequestMethod.POST)
    public ResponseVO removeGroup(@RequestBody int id){
        return workGroupService.removeWorkGroup(id);
    }

    @RequestMapping(value = "/work_group/update",method = RequestMethod.POST)
    public ResponseVO updateGroup(@RequestBody WorkGroupForm  workGroupForm){
        return workGroupService.updateWorkGroup(workGroupForm);
    }
    @RequestMapping(value = "/work_group/add_member",method = RequestMethod.POST)
    public ResponseVO addMember(@RequestBody UserForm userForm,@RequestBody WorkGroupForm  workGroupForm){
        return workGroupService.addMember(userForm,workGroupForm);
    }
}
