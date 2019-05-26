package com.example.hackathon.vo;

import java.sql.Timestamp;
import java.util.Date;

public class MissionForm {
    private int id;
    private int type;//
    private String name;
    private String description;
    private int groupId;
    private Date starttime;
    private Date endtime;

    public int getType() {
        return this.type;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
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
}
