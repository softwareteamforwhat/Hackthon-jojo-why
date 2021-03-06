package com.example.hackathon.po;


import java.sql.Date;

public class WorkGroup {
    private int groupId;
    private int leaderId;
    private String groupname;
    private String mainMission;
    private Integer currentSubmissionId;
    private Date startDate;
    private Date endDate;

    /**
     * 0表示正在进行中
     * 1表示已结束
     */
    private int status=0;

    public int getGroupId() {
        return groupId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }

    public int getUserId() {
        return leaderId;
    }

    public void setUserId(int userId) {
        this.leaderId = userId;
    }

    public String getGroupname() {
        return groupname;
    }

    public void setGroupname(String groupname) {
        this.groupname = groupname;
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

    public int getLeaderId() {
        return leaderId;
    }

    public void setLeaderId(int leaderId) {
        this.leaderId = leaderId;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Integer getCurrentSubmissionId() {
        return currentSubmissionId;
    }

    public void setCurrentSubmissionId(Integer currentSubmissionId) {
        this.currentSubmissionId = currentSubmissionId;
    }
}
