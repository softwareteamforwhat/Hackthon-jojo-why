package com.example.hackathon.po;

import com.example.hackathon.vo.MemberMissionForm;

public class MemberMission extends Mission{
    private int subMissionId;

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
}
