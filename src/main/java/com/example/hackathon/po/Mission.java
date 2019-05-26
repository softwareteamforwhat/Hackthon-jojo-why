package com.example.hackathon.po;

import com.example.hackathon.vo.MissionForm;

import java.sql.Date;


public class Mission {
    private int id;
    private String name;
    private String description;
    private int groupId;
    private Date startDate;
    private Date endDate;
    private Integer status=0;


    public void setForm(Mission mission, MissionForm missionForm){
        missionForm.setId(mission.getId());
        missionForm.setName(mission.getName());
        missionForm.setGroupId(mission.getGroupId());
        missionForm.setDescription(mission.getDescription());
        missionForm.setStarttime(mission.getStarttime());
        missionForm.setEndtime(mission.getEndtime());
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        id = id;
    }



    public int getGroupId() {
        return groupId;
    }
    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public Date getStarttime() {
        return startDate;
    }
    public void setStarttime(Date t) {
        this.startDate = t;
    }

    public Date getEndtime() {
        return endDate;
    }
    public void setEndtime(Date endtime) {
        this.endDate = endtime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
