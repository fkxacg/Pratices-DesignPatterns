package com.fkxacg.study.designpattern.observer;

import java.util.ArrayList;

/**
 * ���۲��ߣ����⣩��ʵ���ࡣ
 * 
 * @author fkxacg
 *
 */

public class WeatherData implements Subject {

	//�������еĹ۲���
	private ArrayList observers;
	
	//��������
	private float temperature;
	private float humidity;
	private float pressure;
	
	//��������ʼ��һ�����б�
	public WeatherData(){
		observers = new ArrayList();
	}
	
	//��ӹ۲���
	@Override
	public void registerObserver(Observer o) {
		observers.add(o);
		
	}

	//�Ƴ��۲���
	@Override
	public void removeObserver(Observer o) {
		int i = observers.indexOf(o);
		if (i >= 0) {
			observers.remove(i);
		}
		
	}

	//֪ͨ���й۲���
	@Override
	public void notifyObservers() {
		for (int i = 0; i < observers.size(); i++){
			Observer observer = (Observer)observers.get(i);
			observer.update(temperature, humidity, pressure);
		}
		
	}
	
	//״̬������˴������֪ͨ���й۲��ߵĺ���
	public void measurementsChanged(){
		notifyObservers();
	}

	//��������ֵ���˴�Ϊ�ֶ����ã�������ɺ���״̬
	public void setMeasurements(float temperature, float humidity, float pressure){
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}
	
	
	//�������ֵ�����ڽ��������󴫸��۲���ʱ�۲���ʹ�õģ����ﲻ��Ҫ
	
	public void getTemperature(){
		
	}
	
	public void getHumidity(){
		
	}
	
	public void getPressure(){
		
	}
}
