package com.example.hackathon.blImpl;

import com.example.hackathon.bl.WorkGroupService;
import com.example.hackathon.data.User2GroupMapper;
import com.example.hackathon.data.WorkGroupMapper;
import com.example.hackathon.po.WorkGroup;
import com.example.hackathon.vo.ResponseVO;
import com.example.hackathon.vo.WorkGroupForm;
import com.example.hackathon.vo.WorkGroupVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class WorkGroupServiceImpl implements WorkGroupService {
    @Autowired
    private WorkGroupMapper workGroupMapper;
    private User2GroupMapper user2GroupMapper;
    @Override
    public ResponseVO addWorkGroup(WorkGroupForm workGroupForm) {
        try {
            int lead_id=workGroupForm.getUserId();
            String groupname=workGroupForm.getGroupname();
            String main_mission=workGroupForm.getMainMission();
            workGroupMapper.createNewWorkGroup(lead_id,groupname,main_mission);
            return ResponseVO.buildSuccess();
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseVO.buildFailure("建立新工作组失败");
        }
    }

    @Override
    public ResponseVO updateWorkGroup(WorkGroupForm updateWorkGroupForm) {
        try {
            //TODO 数据库修改工作组（初步为增加组员）
            return ResponseVO.buildSuccess();
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseVO.buildFailure("增加组员失败");
        }
    }

    @Override
    public ResponseVO removeWorkGroup(int workGroupId) {
        try {
            //TODO 数据库更改工作组状态（实现删除效果）
            return ResponseVO.buildSuccess();
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseVO.buildFailure("删除工作组失败");
        }
    }

    @Override
    public ResponseVO getWorkGroupById() {
        try {
            return null;
            //TODO
//            return ResponseVO.buildSuccess(changeList(workGroupMapper.selectAllMovie()));
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseVO.buildFailure("获取工作组失败");
        }
    }


    private List<WorkGroupVO> changeList(List<WorkGroup> workGroupList){
        List<WorkGroupVO> WorkGroupVOList = new ArrayList<>();
        for(WorkGroup workGroup : workGroupList){
            WorkGroupVOList.add(new WorkGroupVO(workGroup));
        }
        return WorkGroupVOList;
    }
}
