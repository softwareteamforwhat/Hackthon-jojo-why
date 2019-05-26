package com.example.hackathon.po;

import com.example.hackathon.vo.MissionForm;

import java.sql.Timestamp;
import java.util.Date;

public class Mission {
    private int id;
    private String name;
    private String description;
    private int groupId;
    private Date starttime;
    private Date endtime;
    private Integer status;


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
        return starttime;
    }
    public void setStarttime(Date t) {
        this.starttime = t;
    }

    public Date getEndtime() {
        return endtime;
    }
    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
