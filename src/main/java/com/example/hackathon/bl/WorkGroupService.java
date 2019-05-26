package com.example.hackathon.bl;

import com.example.hackathon.vo.ResponseVO;
import com.example.hackathon.vo.WorkGroupForm;
import com.example.hackathon.vo.WorkGroupVO;

public interface WorkGroupService {
    /**
     *新建工作组
     *
     */
    public ResponseVO addWorkGroup(WorkGroupForm addWorkGroupForm);
}
