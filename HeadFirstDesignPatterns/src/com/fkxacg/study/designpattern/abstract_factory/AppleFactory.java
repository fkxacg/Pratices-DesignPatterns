package com.fkxacg.study.designpattern.abstract_factory;

public class AppleFactory implements ComputerFactory {

	@Override
	public Mouse createMouse() {
		return new AppleMouse();
	}

	@Override
	public Keyboard createKeyboard() {
		return new AppleKeyboard();
	}

}
