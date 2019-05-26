package com.example.hackathon.vo;

public class MainMissionForm extends MissionForm {
    private final int type=0;

    private int currentSubMissionId;

    public int getCurrentSubMissionId() {
        return currentSubMissionId;
    }
    public void setCurrentSubMissionId(int currentSubMissionId) {
        this.currentSubMissionId = currentSubMissionId;
    }
}
