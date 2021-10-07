package com.socketproject.model;

public class ChatMessage {
    private MessageType type;
    private String filename;
    private String content;
    private String sender;
    private String roomId;

    public enum MessageType {
        CHAT,
        JOIN,
        LEAVE,
        FILE,
    }

    public MessageType getType() {
        return type;
    }

    public void setType(MessageType type) {
        this.type = type;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getRoomId() {
        return roomId;
    }

    public void setRoomId() {
        this.roomId = roomId;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }
}
