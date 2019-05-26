package com.example.hackathon.vo;

public class MemberMissionForm extends MissionForm {
    private final int type=2;
    private int SubMissionId;

    public int getSubMissionId() {
        return SubMissionId;
    }

    public void setSubMissionId(int subMissionId) {
        SubMissionId = subMissionId;
    }
}
