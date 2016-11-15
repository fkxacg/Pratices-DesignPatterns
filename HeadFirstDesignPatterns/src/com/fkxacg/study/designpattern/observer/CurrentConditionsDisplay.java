package com.fkxacg.study.designpattern.observer;

/**
 * �۲���ʵ���ࡣ
 * 
 * @author fkxacg
 *
 */

public class CurrentConditionsDisplay implements Observer, DisplayElement{

	//�˹۲�����Ҫ���������
	private float temperature;
	private float humidity;
	
	//�������۲��ߣ������ñ��۲��ߴ��б���ɾ���Լ�
	private Subject weatherData;
	
	//�������н��Լ���ӵ����۲����б���
	public CurrentConditionsDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
		
	}
	
	//��ʾ����
	@Override
	public void display() {
		System.out.println("Current conditions: "+temperature+"F degress and "+humidity+"% humidity");
		
	}

	//�������ݣ�������ʾ����
	@Override
	public void update(float temp, float humidity, float pressure) {
		this.temperature = temp;
		this.humidity = humidity;
		display();
	}

}
