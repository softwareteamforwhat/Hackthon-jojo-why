package com.example.hackathon.po;

import com.example.hackathon.vo.MemberMissionForm;
import com.example.hackathon.vo.MissionForm;

import java.util.Date;

public class MemberMission{
    private int subMissionId;
    private int id;
    private String name;
    private String description;
    //private int groupId;
    private Date starttime;
    private Date endtime;
    private Integer status=0;
    private Integer owner_id=null;

    public Integer getOwner_id() {
        return owner_id;
    }

    public void setOwner_id(Integer owner_id) {
        this.owner_id = owner_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    /*public int getGroupId() {
        return groupId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }
    */

    public Date getStarttime() {
        return starttime;
    }

    public void setStarttime(Date starttime) {
        this.starttime = starttime;
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

    public void setSubMissionId(int subMissionId) {
        subMissionId = subMissionId;
    }

    public int getSubMissionId() {
        return subMissionId;
    }

    public MemberMissionForm getForm(){
        MemberMissionForm memberMissionForm=new MemberMissionForm();
        setForm(this,memberMissionForm);
        memberMissionForm.setSubMissionId(this.subMissionId);
        return memberMissionForm;
    }
    public void setForm(MemberMission mission, MissionForm missionForm){
        missionForm.setId(mission.getId());
        missionForm.setName(mission.getName());
        missionForm.setDescription(mission.getDescription());
        missionForm.setStarttime(mission.getStarttime());
        missionForm.setEndtime(mission.getEndtime());
    }
}
