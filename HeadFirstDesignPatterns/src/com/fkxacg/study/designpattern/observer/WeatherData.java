package com.fkxacg.study.designpattern.observer;

import java.util.ArrayList;

/**
 * 被观察者（主题）的实现类。
 * 
 * @author fkxacg
 *
 */

public class WeatherData implements Subject {

	//保存所有的观察者
	private ArrayList observers;
	
	//自身属性
	private float temperature;
	private float humidity;
	private float pressure;
	
	//构造器初始化一个空列表
	public WeatherData(){
		observers = new ArrayList();
	}
	
	//添加观察者
	@Override
	public void registerObserver(Observer o) {
		observers.add(o);
		
	}

	//移出观察者
	@Override
	public void removeObserver(Observer o) {
		int i = observers.indexOf(o);
		if (i >= 0) {
			observers.remove(i);
		}
		
	}

	//通知所有观察者
	@Override
	public void notifyObservers() {
		for (int i = 0; i < observers.size(); i++){
			Observer observer = (Observer)observers.get(i);
			observer.update(temperature, humidity, pressure);
		}
		
	}
	
	//状态变更，此处会调用通知所有观察者的函数
	public void measurementsChanged(){
		notifyObservers();
	}

	//设置属性值，此处为手动设置，并且完成后变更状态
	public void setMeasurements(float temperature, float humidity, float pressure){
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}
	
	
	//获得属性值，用于将整个对象传给观察者时观察者使用的，这里不需要
	
	public void getTemperature(){
		
	}
	
	public void getHumidity(){
		
	}
	
	public void getPressure(){
		
	}
}
