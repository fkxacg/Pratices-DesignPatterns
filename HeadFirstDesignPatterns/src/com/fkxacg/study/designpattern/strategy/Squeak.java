package com.fkxacg.study.designpattern.strategy;

public class Squeak implements QuackBehavior{

	@Override
	public void quack() {
		System.out.println("squeak");
	}

}
