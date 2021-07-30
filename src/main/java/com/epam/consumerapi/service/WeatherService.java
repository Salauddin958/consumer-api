package com.epam.consumerapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.epam.consumerapi.repository.WeatherRepositry;
import com.epam.consumerpi.Model.WeatherData;

@Service
public class WeatherService {
	
	@Autowired
	WeatherRepositry repositry;
	
	public WeatherData saveWeatherData(String data) throws Exception{
		WeatherData weatherData = new WeatherData();
		weatherData.setId(String.valueOf(System.currentTimeMillis()));
		weatherData.setWeatherData(data);
		return repositry.save(weatherData);
	}
}
