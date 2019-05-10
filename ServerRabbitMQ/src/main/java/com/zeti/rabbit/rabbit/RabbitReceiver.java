package com.zeti.rabbit.rabbit;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "hello")
public class RabbitReceiver {

    @RabbitHandler
    public void receiver(String str) {
        System.err.println("Receiver:"+ str);
    }
}
