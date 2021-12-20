package com.rabbit.consumer;

import com.alibaba.fastjson.JSONObject;
import com.rabbitmq.client.Channel;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import java.io.IOException;

/**
 * @author: pengmin
 * @date: 2021/11/9 14:48
 */
@Component
public class AnOtherConsumer {

    public static Integer counter = 0;

    @RabbitListener(queues = {"myQueue1"})
    public void handleMessage(Object object, Channel channel, Message message) throws IOException {
        System.out.println("listener2: " + object.toString());
        channel.basicAck(message.getMessageProperties().getDeliveryTag(), false);
        System.out.println("listener2消费消息数量:" + ++counter);
    }
}
