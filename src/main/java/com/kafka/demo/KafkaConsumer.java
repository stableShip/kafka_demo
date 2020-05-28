package com.kafka.demo;

import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class KafkaConsumer {
    
    @KafkaListener(topicPattern = "test", groupId="test")
    public void listen(ConsumerRecord record){
        log.info("got message, consumerRecord: {}, message: {}", record, record.value());
    }
}
