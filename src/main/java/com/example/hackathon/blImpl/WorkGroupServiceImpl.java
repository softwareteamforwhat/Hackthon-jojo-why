package com.example.hackathon.blImpl;

import com.example.hackathon.bl.WorkGroupService;
import com.example.hackathon.data.User2GroupMapper;
import com.example.hackathon.data.WorkGroupMapper;
import com.example.hackathon.po.WorkGroup;
import com.example.hackathon.vo.ResponseVO;
import com.example.hackathon.vo.UserForm;
import com.example.hackathon.vo.WorkGroupForm;
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
    public ResponseVO addWorkGroup(int groupId, int userId, String groupName, String mainMission) {
        try {
            int lead_id=userId;
            String groupname=groupName;
            String main_mission=mainMission;
            workGroupMapper.createNewWorkGroup(lead_id,groupname,main_mission);
            return ResponseVO.buildSuccess();
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseVO.buildFailure("建立新工作组失败");
        }
    }

    @Override
    public ResponseVO updateWorkGroup(int groupId,int userId,String groupName,String mainMission) {
        try {
            int lead_id=userId;
            String groupname=groupName;
            String main_mission=mainMission;
            workGroupMapper.createNewWorkGroup(lead_id,groupname,main_mission);
            return ResponseVO.buildSuccess();
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseVO.buildFailure("修改工作组信息失败");
        }
    }

    @Override
    public ResponseVO removeWorkGroup(int workGroupId) {
        try {
            workGroupMapper.updateStatus(workGroupId);
            return ResponseVO.buildSuccess();
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseVO.buildFailure("删除工作组失败");
        }
    }


    @Override
    public ResponseVO getWorkGroupById(int userId) {
        try {
            List<Integer> reslist = user2GroupMapper.getGroupIdByUserId(userId);
            List<WorkGroup> wlist=new ArrayList<WorkGroup>();
            for(int i=0;i< reslist.size();i++){
                wlist.add(user2GroupMapper.getGroupByGroupId(reslist.get(i)));
            }

            return  ResponseVO.buildSuccess(wlist);

        } catch (Exception e) {
            e.printStackTrace();
            return ResponseVO.buildFailure("获取工作组失败");
        }
    }




    @Override
    public ResponseVO addMember(int userId, int groupId) {
        try {
            user2GroupMapper.userJoinGroup(userId,groupId);
            return ResponseVO.buildSuccess();
        }catch (Exception e){
            e.printStackTrace();
            return ResponseVO.buildFailure("增加成员失败");
        }
    }
}