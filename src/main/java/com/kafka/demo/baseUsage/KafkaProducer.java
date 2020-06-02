package com.kafka.demo.baseUsage;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class KafkaProducer {

    @Autowired
    KafkaTemplate kafkaTemplate;

    private Gson gson = new GsonBuilder().create();

    public Boolean sendMessage() throws InterruptedException {
        for (int i = 1; i < 1000; i++) {
            kafkaTemplate.send("test", gson.toJson(ProducerData.builder().msg("test").build()));
            Thread.sleep(5000);
        }
        log.info("sent message");
        return true;
    }

}
