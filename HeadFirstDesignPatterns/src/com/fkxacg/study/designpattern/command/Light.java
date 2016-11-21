package com.fkxacg.study.designpattern.command;


/**
 * 灯。
 * 
 * 此处没有记录灯的状态，就是简单的开、关两个方法。
 * 此类就按照正常类写，不用考虑太多模式里的实现。
 * 
 * @author fkxacg
 *
 */
public class Light {

	public void on(){
		System.out.println("light on");
	}
	
	public void off(){
		System.out.println("light off");
	}
}
