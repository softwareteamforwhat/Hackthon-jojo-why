package com.example.hackathon.bl;

import com.example.hackathon.vo.ResponseVO;
import com.example.hackathon.vo.UserForm;
import com.example.hackathon.vo.WorkGroupForm;


public interface WorkGroupService {

    ResponseVO addWorkGroup(WorkGroupForm addWorkGroupForm);
    ResponseVO updateWorkGroup(WorkGroupForm updateWorkGroupForm);
    /**
     * 修改group状态为已完成
     * @param workGroupId
     * @return
     */
    ResponseVO removeWorkGroup(int workGroupId);
    ResponseVO getWorkGroupById(int userId);
    ResponseVO addMember(UserForm userForm,WorkGroupForm workGroupForm);
}
