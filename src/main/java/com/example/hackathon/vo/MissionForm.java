package com.example.hackathon.vo;

import java.sql.Timestamp;

public class MissionForm {
    private int type;//
    private String name;
    private String description;
    private int groupId;
    private Timestamp starttime;
    private Timestamp endtime;

    public int getType() {
        return this.type;
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
