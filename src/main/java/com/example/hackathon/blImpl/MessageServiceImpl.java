package com.example.hackathon.blImpl;

import com.example.hackathon.bl.MessageService;
import com.example.hackathon.data.MessageMapper;
import com.example.hackathon.po.Message;
import com.example.hackathon.vo.ResponseVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessageServiceImpl implements MessageService {
    @Autowired
    MessageMapper messageMapper;

    @Override
    public ResponseVO getReceivedMessage(int userId) {
        try{
            List<Message> messageList=messageMapper.selectMessageListByUserId(userId);
            return ResponseVO.buildSuccess(messageList);
        }catch (Exception e){
            return ResponseVO.buildFailure("");
        }

    }

    @Override
    public ResponseVO sendMessage(int senderId, int receiverId,String data) {
        try {
            Message message = new Message();
            message.setSenderId(senderId);
            message.setReceiverId(receiverId);
            message.setData(data);
            messageMapper.insertMessage(message);
            return ResponseVO.buildSuccess();
        }catch (Exception e){
            return ResponseVO.buildFailure("");
        }
    }
}
