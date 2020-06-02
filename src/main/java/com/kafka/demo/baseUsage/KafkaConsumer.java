package com.kafka.demo.baseUsage;

import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.Acknowledgment;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import javax.accessibility.AccessibleKeyBinding;

@Component
@Slf4j
public class KafkaConsumer {
    
    @KafkaListener(topicPattern = "test", groupId="test")
    public void listen(ConsumerRecord record, Acknowledgment acknowledgment){
        log.info("got message, consumerRecord: {}, message: {}", record, record.value());
        acknowledgment.acknowledge();
    }
}
