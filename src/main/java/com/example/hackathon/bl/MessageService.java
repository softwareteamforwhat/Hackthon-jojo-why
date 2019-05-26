package com.example.hackathon.bl;

import com.example.hackathon.vo.ResponseVO;

public interface MessageService {
    /**
     * @param senderId
     * @param receiverId
     * @param data
     * @return
     */
    ResponseVO sendMessage(int senderId,int receiverId,String data);

    /**
     * @param userId
     */
    ResponseVO getReceivedMessage(int userId);

}
