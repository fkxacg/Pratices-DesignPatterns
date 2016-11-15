package com.fkxacg.study.designpattern.observer;

public class WeatherStation {
	public static void main(String[] args){
		
		//创建观察者和被观察者
		WeatherData weatherData = new WeatherData();
		CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
		//StatisticsDisplay
		//ForecastDisplay
		
		//修改状态
		weatherData.setMeasurements(80, 65, 30.4f);
		weatherData.setMeasurements(82, 70, 29.2f);
		weatherData.setMeasurements(78, 90, 29.2f);
	}

}
