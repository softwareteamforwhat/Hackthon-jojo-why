package com.example.hackathon.data;

public interface MainMissionMapper {
    /**
     * 根据groupId查找对应的MainMission
     * @param groupId
     * @return MainMission
     */
    MainMission selectMainMissionByGroupId(int groupId);

    void insertMainMission(MainMission mainMission);

    /**
     * 根据MainMission的Id查找对应的MainMission
     * @param Id
     * @return
     */
    MainMission selectMainMissionById(int Id);

    /**
     * 根据groupId将某一个group的状态改为已经结束
     * 成功则返回true，失败返回false
     */
    boolean end(int groupId);



}
