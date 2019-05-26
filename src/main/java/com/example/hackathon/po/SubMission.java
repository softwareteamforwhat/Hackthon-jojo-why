package com.example.hackathon.po;

import com.example.hackathon.vo.SubMissionForm;

public class SubMission extends Mission{

    private int MainMissionId;

    public void setMainMissionId(int mainMissionId) {
        MainMissionId = mainMissionId;
    }

    public int getMainMissionId() {
        return MainMissionId;
    }

    public SubMissionForm getForm(){
        SubMissionForm subMissionForm=new SubMissionForm();
        setForm(this,subMissionForm);
        subMissionForm.setMainMissionId(this.MainMissionId);
        return subMissionForm;
    }


}
