package com.example.hackathon.po;

import com.example.hackathon.vo.UserVO;

import java.util.List;

public class WorkGroup {
    private int groupId;
    private int userId;
    private String groupname;
    private MainMission mainMission;
    private List<User> userList;
    /**
     * o表示正在进行中
     * 1表示已结束
     */
    private int status;

    public int getGroupId() {
        return groupId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getGroupname() {
        return groupname;
    }

    public void setGroupname(String groupname) {
        this.groupname = groupname;
    }

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }

    public String getMainMission() {
        return mainMission;
    }

    public void setMainMission(String mainMission) {
        this.mainMission = mainMission;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
