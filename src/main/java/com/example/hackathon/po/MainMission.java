package com.example.hackathon.po;

import com.example.hackathon.vo.MainMissionForm;

public class MainMission extends Mission{
    private final int type=0;
    private int currentSubMissionId;

    public int getCurrentSubMissionId() {
        return currentSubMissionId;
    }
    public void setCurrentSubMissionId(int currentSubMissionId) {
        this.currentSubMissionId = currentSubMissionId;
    }

    public MainMissionForm getForm(){
        MainMissionForm mainMissionForm=new MainMissionForm();
        setForm(this,mainMissionForm);
        mainMissionForm.setCurrentSubMissionId(this.currentSubMissionId);
        return mainMissionForm;
    }
}
