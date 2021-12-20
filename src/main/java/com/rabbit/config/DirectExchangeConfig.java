package com.rabbit.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author: pengmin
 * @date: 2021/11/9 14:06
 */
@Configuration
public class DirectExchangeConfig {
    @Bean
    public DirectExchange directExchange() {
        DirectExchange directExchange = new DirectExchange("direct");
        return directExchange;
    }

    @Bean
    public Queue directQueue1() {
        Queue queue = new Queue("directqueue1");
        return queue;
    }

    @Bean
    public Queue directQueue2() {
        Queue queue = new Queue("directqueue2");
        return queue;
    }

    //3个binding将交换机和相应队列连起来
    @Bean
    public Binding bindingorange() {
        Binding binding = BindingBuilder.bind(directQueue1()).to(directExchange()).with("orange");
        return binding;
    }

    @Bean
    public Binding bindingblack() {
        Binding binding = BindingBuilder.bind(directQueue2()).to(directExchange()).with("black");
        return binding;
    }

    @Bean
    public Binding bindinggreen() {
        Binding binding = BindingBuilder.bind(directQueue2()).to(directExchange()).with("green");
        return binding;
    }
}
