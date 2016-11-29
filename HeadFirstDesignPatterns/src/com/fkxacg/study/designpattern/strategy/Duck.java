package com.fkxacg.study.designpattern.strategy;

/**
 * 抽象鸭子。
 * 
 * 
 * 
 * @author fkxacg
 *
 */
public abstract class Duck {
	//行为变量。
	QuackBehavior quackBehavior;
	FlyBehavior flyBehavior;
	
	public void performQuack() {
		quackBehavior.quack();
	}
	
	public void performFly() {
		flyBehavior.fly();
	}
	
	public void swim() {
		System.out.println("All ducks float, even decoys!");
	}
	
	public abstract void display();

	public void setQuackBehavior(QuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}

	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}

	
}
