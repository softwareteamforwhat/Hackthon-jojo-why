package com.example.hackathon.data;

import com.example.hackathon.po.Message;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
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
