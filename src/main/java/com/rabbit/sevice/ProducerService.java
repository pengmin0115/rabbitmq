package com.rabbit.sevice;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.rabbit.entity.MqMessage;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.nio.charset.StandardCharsets;
import java.util.UUID;

/**
 * @author: pengmin
 * @date: 2021/11/9 14:10
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class ProducerService {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    public void sendMessage(String queue) {
        MqMessage message = new MqMessage(UUID.randomUUID().toString().replaceAll("-", ""), "hello world");
        rabbitTemplate.setDefaultReceiveQueue(queue);
        rabbitTemplate.setEncoding(StandardCharsets.UTF_8.name());
        rabbitTemplate.convertAndSend(queue, message);
    }

}
