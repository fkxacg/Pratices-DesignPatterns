package com.fkxacg.study.designpattern.template;

/**
 * 
 * 模板方法类。
 * 
 * 在模板方法里按具体算法执行一些其他方法
 * 所有子类必须要做的方法在这里实现
 * 要求子类自己实现的方法设置为抽象方法
 * 
 * 还可以设置一些空方法，让子类决定要不要实现。（钩子）
 * 
 * @author fkxacg
 *
 */
public abstract class CaffeineBeverage {

	final void prepareRecipe() {
		boilWater();
		brew();
		pourInCup();
		addCondiments();
	}
	
	abstract void brew();
	
	abstract void addCondiments();
	
	void boilWater() {
		System.out.println("Boiling water");
	}
	
	void pourInCup() {
		System.out.println("pouring into cup");
	}
}
