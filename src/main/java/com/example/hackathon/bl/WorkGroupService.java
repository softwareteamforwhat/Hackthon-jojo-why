package com.example.hackathon.bl;

import com.example.hackathon.vo.ResponseVO;
import com.example.hackathon.vo.WorkGroupForm;
import com.example.hackathon.vo.WorkGroupVO;

public interface WorkGroupService {

    ResponseVO addWorkGroup(WorkGroupForm addWorkGroupForm);
    ResponseVO updateWorkGroup(WorkGroupForm updateWorkGroupForm);//增加组员
    ResponseVO removeWorkGroup(int workGroupId);
    ResponseVO getAllWorkGroup();
    ResponseVO getOtherWorkGroup();
}
