package com.example.hackathon.Controller;

import com.example.hackathon.bl.MessageService;
import com.example.hackathon.vo.ResponseVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {
    @Autowired
    private MessageService messageService;

    @PostMapping("/send")
    public ResponseVO sendMessage(@RequestParam("senderId") int senderId,@RequestParam("receiverId") int receiverId,@RequestParam("data") String data){
        return messageService.sendMessage(senderId, receiverId, data);
    }

    @PostMapping("/getReceivedMessage")
    public ResponseVO getReceivedMessage(@RequestParam("userId") int userId){
        return messageService.getReceivedMessage(userId);
    }



}
