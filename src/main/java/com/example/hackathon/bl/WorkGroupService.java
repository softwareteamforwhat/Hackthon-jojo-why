package com.example.hackathon.bl;

import com.example.hackathon.vo.ResponseVO;
import com.example.hackathon.vo.WorkGroupForm;
import com.example.hackathon.vo.WorkGroupVO;

public interface WorkGroupService {

    public ResponseVO addWorkGroup(WorkGroupForm addWorkGroupForm);
    public ResponseVO updateWorkGroup(WorkGroupForm updateWorkGroupForm);//增加组员
    public ResponseVO removeWorkGroup(int workGroupId);
    public ResponseVO getAllWorkGroup();
    public ResponseVO getOtherWorkGroup();
}
