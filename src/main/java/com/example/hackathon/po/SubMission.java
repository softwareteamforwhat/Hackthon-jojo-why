package com.example.hackathon.po;

import com.example.hackathon.vo.SubMissionForm;

public class SubMission extends Mission{



    public SubMissionForm getForm(){
        SubMissionForm subMissionForm=new SubMissionForm();
        setForm(this,subMissionForm);
        return subMissionForm;
    }


}
