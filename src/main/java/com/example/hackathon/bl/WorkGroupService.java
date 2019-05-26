package com.example.hackathon.bl;

import com.example.hackathon.vo.ResponseVO;

public interface WorkGroupService {
    /**
     *新建工作组
     *@param mainMission 小组目标
     * @param userId 建立者
     */
    public ResponseVO addWorkGroup(String mainMission,int userId);
}
