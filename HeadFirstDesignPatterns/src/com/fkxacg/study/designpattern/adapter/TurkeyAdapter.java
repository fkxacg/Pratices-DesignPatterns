package com.fkxacg.study.designpattern.adapter;

/**
 * 适配类。
 * 
 * 要将一个火鸡当作鸭子来处理。
 * 实现鸭子接口，此类就是一个鸭子具体类。
 * 内涵一个火鸡对象，此为真实对象。
 * 
 * @author fkxacg
 *
 */
public class TurkeyAdapter implements Duck {

	Turkey turkey;
	
	public TurkeyAdapter(Turkey turkey) {
		this.turkey = turkey;
	}
	
	@Override
	public void quack() {
		turkey.gobble();
	}

	@Override
	public void fly() {
		for(int i=0; i < 5; i++) {
			turkey.fly();
		}
	}

}
