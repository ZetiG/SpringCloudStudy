package com.zeti.rabbit.rabbit;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 消息发送者
 */
@Component
public class RabbitSender {

    @Autowired
    private AmqpTemplate amqpTemplate;

    public void send(String str) {
        System.err.println("Sender:"+str);
        this.amqpTemplate.convertAndSend("hello", str);
    }
}
