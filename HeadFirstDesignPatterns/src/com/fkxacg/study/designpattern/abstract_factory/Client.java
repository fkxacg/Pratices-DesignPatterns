package com.fkxacg.study.designpattern.abstract_factory;

public class Client {

	public static void main(String[] args) {
		ComputerFactory cf = new AppleFactory();
		Mouse mouse = cf.createMouse();
		Keyboard keyboard = cf.createKeyboard();
		mouse.click();
		keyboard.push();
		
		cf = new MicrosoftFactory();
		mouse = cf.createMouse();
		keyboard = cf.createKeyboard();
		mouse.click();
		keyboard.push();
	}

}
