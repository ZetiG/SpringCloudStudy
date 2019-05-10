package com.zeti.rabbit;

import com.zeti.rabbit.rabbit.RabbitSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RabbitApplication {

    public static void main(String[] args) {
        SpringApplication.run(RabbitApplication.class, args);
    }

    @Autowired
    private RabbitSender sender;

    public void rabbitMQ() {
        sender.send("Hello RabbitMQ");
    }
}
