package com.example.hackathon.po;

public class Message {
    int senderId;
    int receiverId;
    String data;

    public int getReceiverId() {
        return receiverId;
    }

    public int getSenderId() {
        return senderId;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setReceiverId(int receiverId) {
        this.receiverId = receiverId;
    }

    public void setSenderId(int senderId) {
        this.senderId = senderId;
    }
}
