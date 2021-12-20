package com.rabbit.config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author: pengmin
 * @date: 2021/11/9 14:01
 */
@Configuration
public class ProducerConfig {

    @Bean
    public Queue queue () {
        return new Queue("myQueue1");
    }
}
