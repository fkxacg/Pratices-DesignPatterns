package com.fkxacg.study.designpattern.factory_method;

public class Google implements Company{

	@Override
	public Phone createPhone() {
		return new Nexus();
	}

}
