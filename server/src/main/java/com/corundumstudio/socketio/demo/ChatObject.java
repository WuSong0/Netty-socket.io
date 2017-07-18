package com.corundumstudio.socketio.demo;

public class ChatObject {

    private String ip;
    private String message;

    public ChatObject() {
    }

    public ChatObject(String ip, String message) {
        super();
        this.ip = ip;
        this.message = message;
    }

    public String getIp() {
        return ip;
    }
    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }

}
