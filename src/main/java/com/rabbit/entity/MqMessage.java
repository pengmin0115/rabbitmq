package com.rabbit.entity;

import java.io.Serializable;

/**
 * @author: pengmin
 * @date: 2021/11/9 14:59
 */
public class MqMessage implements Serializable {

    private String messageId;

    private String message;

    public MqMessage() {
    }

    public MqMessage(String messageId, String message) {
        this.messageId = messageId;
        this.message = message;
    }

    public String getMessageId() {
        return messageId;
    }

    public MqMessage setMessageId(String messageId) {
        this.messageId = messageId;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public MqMessage setMessage(String message) {
        this.message = message;
        return this;
    }

    @Override
    public String toString() {
        return "MqMessage{" +
                "messageId='" + messageId + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
