package com.example.hackathon.blImpl;

import com.example.hackathon.bl.WorkGroupService;
import com.example.hackathon.vo.ResponseVO;
import com.example.hackathon.vo.WorkGroupForm;
import com.example.hackathon.vo.WorkGroupVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WorkGroupServiceImpl implements WorkGroupService {
    @Autowired
    private WorkGroupService workGroupService;
    @Override
    public ResponseVO addWorkGroup(WorkGroupForm workGroupForm) {
        try {
            //TODO 数据库新增工作组
            return ResponseVO.buildSuccess();
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseVO.buildFailure("建立新工作组失败");
        }
    }
}
