package com.epam.consumerapi.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;


@Service
public class ConsumerService {
	private static final Logger logger = LoggerFactory.getLogger(ConsumerService.class);

//    @KafkaListener(topics = "kafkaTopic", groupId = "group_id") 
//    public void consume(String model){
//        logger.info("Consumed message :: ", model);
//    }
}
