package com.example.kafka.demo01;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class ConsumerListener {

    @KafkaListener(id = "myContainer", topics = "topic1", clientIdPrefix = "myClientId", autoStartup = "true")
    public void listen1(String data) {
        System.out.println("consumer" + data);
    }
}