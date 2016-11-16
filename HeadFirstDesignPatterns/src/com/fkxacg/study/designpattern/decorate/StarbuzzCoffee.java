package com.fkxacg.study.designpattern.decorate;

public class StarbuzzCoffee {
	public static void main(String[] args){
		
		//��ͨ����
		Beverage beverage = new Espresso();
		System.out.println(beverage.getDescription()+" $" + beverage.cost());
		
		
		//˫��Ħ����һ���̵�Ũ������
		Beverage beverage2 = new Espresso();
		beverage2 = new Mocha(beverage2);
		beverage2 = new Mocha(beverage2);
		beverage2 = new Milk(beverage2);
		System.out.println(beverage2.getDescription()+" $" + beverage2.cost());
	}
}
