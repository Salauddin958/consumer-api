package com.epam.consumerapi.repository;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.epam.consumerpi.Model.WeatherData;

@Repository
public interface WeatherRepositry extends MongoRepository<WeatherData, String>{
	
}
