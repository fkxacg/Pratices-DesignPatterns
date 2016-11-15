package com.fkxacg.study.designpattern.observer;

/**
 * 观察者接口。
 * 
 * 含有更新函数。接受从被观察者处传来的值，更新自己的状态。
 * 此处参数是定义好的，之后建议使用被观察者的对象或专门类的对象。
 * 
 * @author fkxacg
 *
 */

public interface Observer {
	public void update(float temp, float humidity, float pressure);
}
