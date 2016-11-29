package com.fkxacg.study.designpattern.factory_method;

public class Apple implements Company {

	@Override
	public Phone createPhone() {
		return new IPhone();
	}

}
