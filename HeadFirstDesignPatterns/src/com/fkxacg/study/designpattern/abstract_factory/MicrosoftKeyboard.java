package com.fkxacg.study.designpattern.abstract_factory;

public class MicrosoftKeyboard implements Keyboard {

	@Override
	public void push() {
		System.out.println("(microsoft) keyboard push");
	}

}
