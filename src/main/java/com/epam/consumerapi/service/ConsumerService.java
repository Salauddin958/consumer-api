package com.epam.consumerapi.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@EnableKafka
@Service
public class ConsumerService {
	private static final Logger logger = LoggerFactory.getLogger(ConsumerService.class);

    @KafkaListener(topics = "weather-data-topic", groupId = "group_id") 
    public void consume(String model){
        logger.info("Consumed message :: ", model);
    }
}
