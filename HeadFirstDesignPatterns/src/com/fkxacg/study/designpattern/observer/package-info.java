/**
 * 观察者模式。
 * 当被观察者的状态改变后发送消息给所有的观察者。
 * 
 * 观察者（Observer）和被观察者（Subject）分别有一个接口。
 * 被观察者保存一个观察者列表，用于添加、删除观察者，并且在改变状态后通知所有观察者。
 * 
 * 被观察者有一个改变函数，根据具体情况当被观察者需要通知观察者时调用此函数，此函数会调用通知函数通知所有观察者。
 * 观察者含有一个更新函数，被观察者将调用此函数。
 * 
 * 此处使用WeatherData作为被观察者，只要天气状况发生了变化就会将信息传给CurrentConditionsDisplay用于显示当前信息。
 */
/**
 * @author fkxacg
 *
 */
package com.fkxacg.study.designpattern.observer;