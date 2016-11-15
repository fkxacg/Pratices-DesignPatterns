package com.fkxacg.study.designpattern.observer;

/**
 * 被观察者接口，也叫主题。
 * 
 * 可以添加、删除、通知观察者。
 * 
 * @author fkxacg
 *
 */

public interface Subject {
	public void registerObserver(Observer o);
	public void removeObserver(Observer o);
	public void notifyObservers();
}
