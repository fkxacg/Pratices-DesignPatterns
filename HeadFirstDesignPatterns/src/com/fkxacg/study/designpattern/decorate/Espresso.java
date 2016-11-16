package com.fkxacg.study.designpattern.decorate;

public class Espresso extends Beverage{

	public Espresso(){
		this.description = "Espresso";
	}
	
	@Override
	public double cost() {
		return 1.99;
	}

}
