package com.barry.buttonweb.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class ColorEventService {

    @Autowired  // Tells Spring to Inject an instance of KafkaTemplate into our class.
    private KafkaTemplate<String, String> kafkaTemplate;

    public void sendMessage(String message){
        this.kafkaTemplate.send("barry", message, message);

    }
    
}