package com.kafka.demo;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.kafka.demo.entity.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class KafkaProducer {
    
    @Autowired
    KafkaTemplate kafkaTemplate;

    private Gson gson = new GsonBuilder().create();
    
    public Boolean sendMessage(){
        Message message = Message.builder().id(1L).msg("test").build();
        kafkaTemplate.send("test", gson.toJson(message));
        return true;
    }
    
}
