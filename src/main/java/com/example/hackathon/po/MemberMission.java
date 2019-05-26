package com.example.hackathon.po;

import com.example.hackathon.vo.MemberMissionForm;

public class MemberMission extends Mission{
    private final int type=2;
    private int SubMissionId;

    public void setSubMissionId(int subMissionId) {
        SubMissionId = subMissionId;
    }

    public int getSubMissionId() {
        return SubMissionId;
    }

    public MemberMissionForm getForm(){
        MemberMissionForm memberMissionForm=new MemberMissionForm();
        setForm(this,memberMissionForm);
        memberMissionForm.setSubMissionId(this.SubMissionId);
        return memberMissionForm;
    }
}
