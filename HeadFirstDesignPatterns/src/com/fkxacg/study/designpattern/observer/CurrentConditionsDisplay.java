package com.fkxacg.study.designpattern.observer;

/**
 * 观察者实现类。
 * 
 * @author fkxacg
 *
 */

public class CurrentConditionsDisplay implements Observer, DisplayElement{

	//此观察者需要保存的数据
	private float temperature;
	private float humidity;
	
	//保留被观察者，用于让被观察者从列表中删除自己
	private Subject weatherData;
	
	//构造器中将自己添加到被观察者列表中
	public CurrentConditionsDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
		
	}
	
	//显示函数
	@Override
	public void display() {
		System.out.println("Current conditions: "+temperature+"F degress and "+humidity+"% humidity");
		
	}

	//更新数据，调用显示函数
	@Override
	public void update(float temp, float humidity, float pressure) {
		this.temperature = temp;
		this.humidity = humidity;
		display();
	}

}
