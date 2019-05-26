package com.example.hackathon.po;

import com.example.hackathon.vo.MissionForm;

import java.sql.Timestamp;

public class Mission {
    private int Id;
    private String name;
    private String description;
    private int groupId;
    private Timestamp starttime;
    private Timestamp endtime;


    public void setForm(Mission mission, MissionForm missionForm){
        missionForm.setId(mission.getId());
        missionForm.setName(mission.getName());
        missionForm.setGroupId(mission.getGroupId());
        missionForm.setDescription(mission.getDescription());
        missionForm.setStarttime(mission.getStarttime());
        missionForm.setEndtime(mission.getEndtime());
    }
    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
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

    public Timestamp getStarttime() {
        return starttime;
    }
    public void setStarttime(Timestamp t) {
        this.starttime = t;
    }

    public Timestamp getEndtime() {
        return endtime;
    }
    public void setEndtime(Timestamp endtime) {
        this.endtime = endtime;
    }
}
