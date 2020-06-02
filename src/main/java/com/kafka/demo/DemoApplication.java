package com.kafka.demo;

import com.kafka.demo.baseUsage.KafkaProducer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoApplication {
    
    public static void main(String[] args) throws InterruptedException {
        ConfigurableApplicationContext context = SpringApplication.run(DemoApplication.class, args);
        KafkaProducer sender = context.getBean(KafkaProducer.class);
        sender.sendMessage();
    }

}
