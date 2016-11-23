package com.fkxacg.study.designpattern.template;

public class Tea extends CaffeineBeverage{
	
	public void brew() {
		System.out.println("Steeping in the tea");
	}
	
	public void addCondiments() {
		System.out.println("Adding Lemon");
	}
}