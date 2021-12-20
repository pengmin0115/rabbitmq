package com.rabbit.runner;

import com.rabbit.sevice.ProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * @author: pengmin
 * @date: 2021/11/9 14:16
 */
@Component
public class RabbitMqRunner implements CommandLineRunner {

    @Autowired
    private ProducerService producerService;

    @Override
    public void run(String... args) throws Exception {
        for (int i = 0; i < 1000000; i++) {
            producerService.sendMessage("myQueue1");
        }
    }
}
