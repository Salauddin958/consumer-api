package com.epam.consumerapi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.epam.consumerapi.service.WeatherService;

@RestController
@RequestMapping("/weather")
public final class KafkaController {
    
	@Autowired
	WeatherService service;
	
    @KafkaListener(groupId = "group_id", topics = "kafkaTopic",
    		containerFactory = "kafkaListenerContainerFactory")
    public void getWeatherData(String data) throws Exception{
    	System.out.println("inside kafka consumer");
    	service.saveWeatherData(data);
    }
}