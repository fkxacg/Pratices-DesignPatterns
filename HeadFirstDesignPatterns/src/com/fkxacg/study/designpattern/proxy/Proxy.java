package com.fkxacg.study.designpattern.proxy;

/**
 * ¥˙¿Ì¿‡
 * @author fkxacg
 *
 */
public class Proxy implements Sourceable{

	Sourceable source;
	
	public Proxy() {
		source = new Source();
	}
	
	@Override
	public void method() {
		before();
		source.method();
		after();
	}
	
	public void before() {
		System.out.println("before");
	}
	
	public void after() {
		System.out.println("after");
	}

}
