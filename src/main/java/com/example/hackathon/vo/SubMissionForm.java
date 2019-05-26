package com.example.hackathon.vo;

public class SubMissionForm extends MissionForm {
    private final int type=1;
    private int MainMissionId;

    public void setMainMissionId(int mainMissionId) {
        MainMissionId = mainMissionId;
    }
    public int getMainMissionId() {
        return MainMissionId;
    }
}
