package com.fkxacg.study.designpattern.abstract_factory;

public class MicrosoftFactory implements ComputerFactory{

	@Override
	public Mouse createMouse() {
		return new MicrosoftMouse();
	}

	@Override
	public Keyboard createKeyboard() {
		return new MicrosoftKeyboard();
	}

}
