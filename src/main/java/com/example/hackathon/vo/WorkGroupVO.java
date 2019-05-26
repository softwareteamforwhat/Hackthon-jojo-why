package com.example.hackathon.vo;

import com.example.hackathon.po.WorkGroup;

import java.util.List;

public class WorkGroupVO {
    private int groupId;
    private int userId;
    private String groupname;
    private String mainMission;
    private List<UserVO> userVOList;

    public WorkGroupVO(WorkGroup workGroup) {
        this.groupId = groupId;
        this.userId = userId;
        this.groupname = groupname;
        this.mainMission = mainMission;
        this.userVOList = userVOList;
    }


    public String getMainMission() {
        return mainMission;
    }

    public void setMainMission(String mainMission) {
        this.mainMission = mainMission;
    }

    public String getGroupname() {
        return groupname;
    }

    public void setGroupname(String groupname) {
        this.groupname = groupname;
    }


    public int getGroupId() {
        return groupId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }

    public List<UserVO> getUserVOList() {
        return userVOList;
    }

    public void setUserVOList(List<UserVO> userVOList) {
        this.userVOList = userVOList;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }


}
