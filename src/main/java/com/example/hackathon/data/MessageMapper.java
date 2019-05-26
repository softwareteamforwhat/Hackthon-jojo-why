package com.example.hackathon.data;

import com.example.hackathon.po.Message;

import java.util.List;

public interface MessageMapper {
    /**
     * @param message
     */
    void insertMessage(Message message);

    /**
     * @param userId
     */
    List<Message> selectMessageListByUserId(int userId);


}
