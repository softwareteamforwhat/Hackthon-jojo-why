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
    public ResponseVO sendMessage(@RequestParam("senderId") String senderId,@RequestParam("receiverId") String receiverId,@RequestParam("data") String data){
        System.out.println("sender:"+senderId);
        System.out.println("receiverId:"+receiverId);
        System.out.println("data"+data);
        return messageService.sendMessage(Integer.parseInt(senderId), Integer.parseInt(receiverId), data);
    }

    @PostMapping("/getReceivedMessage")
    public ResponseVO getReceivedMessage(@RequestParam(value = "userId") String userId,@RequestParam("motherfucker")String motherfucker){
        return messageService.getReceivedMessage(Integer.parseInt(userId));
    }



}
