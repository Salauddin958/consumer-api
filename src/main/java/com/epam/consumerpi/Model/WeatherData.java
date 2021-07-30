package com.epam.consumerpi.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("weatherData")
public class WeatherData {

	@Id
	private String id;
	private String weatherData;
	
	@Override
	public String toString() {
		return "WeatherData [id=" + id + ", weatherData=" + weatherData + "]";
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getWeatherData() {
		return weatherData;
	}
	public void setWeatherData(String weatherData) {
		this.weatherData = weatherData;
	}
	
}
