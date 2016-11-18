package com.fkxacg.study.designpattern.singleton;

public class Singleton {
	private volatile static Singleton uniqueInstance;
	
	private Singleton() {}
	
	public static Singleton getInstance(){
		
		//Ë«ÖØ¼ì²éËø
		if (uniqueInstance == null) {
			synchronized (Singleton.class){
				if (uniqueInstance == null) {
					uniqueInstance = new Singleton();
				}
			}
		}
		return uniqueInstance;
	}
}
