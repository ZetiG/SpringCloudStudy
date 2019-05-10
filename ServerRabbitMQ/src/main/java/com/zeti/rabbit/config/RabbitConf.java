package com.zeti.rabbit.config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class RabbitConf {

    /**
     * 配置队列
     * 
     * @return
     */
    @Bean
    public Queue queue() {
        return new Queue("hello");
    }
}
