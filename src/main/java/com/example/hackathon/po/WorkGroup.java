package com.example.hackathon.po;

import com.example.hackathon.vo.UserVO;

import java.util.List;

public class WorkGroup {
    private int groupId;
    private int userId;
    private String groupname;
    private String mainMission;
    private List<User> userList;

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

    public MainMission getMainMission() {
        return mainMission;
    }

    public void setMainMission(MainMission mainMission) {
        this.mainMission = mainMission;
    }

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }
}
