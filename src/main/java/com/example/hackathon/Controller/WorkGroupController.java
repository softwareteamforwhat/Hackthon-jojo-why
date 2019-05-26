package com.example.hackathon.Controller;

import com.example.hackathon.bl.WorkGroupService;
import com.example.hackathon.vo.ResponseVO;
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
    @RequestMapping(value = "/workgroup/add", method = RequestMethod.POST)
    public ResponseVO addWorkGroup(@RequestBody WorkGroupForm workGroupForm){
        return workGroupService.addWorkGroup(workGroupForm);
    }

}
