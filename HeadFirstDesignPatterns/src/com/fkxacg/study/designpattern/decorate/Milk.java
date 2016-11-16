package com.fkxacg.study.designpattern.decorate;

/**
 * ţ�̡�
 * Ҫ�ڿ����м�һ��ţ�̾��ô���װ��һ�Ρ�
 * 
 * ����ʱ��Ҫһ����װ�ζ���
 * ����˵������֮ǰ�ַ���������һ�����ϡ�
 * ���ؼ۸��м����Լ��ļ۸�
 * 
 * @author fkxacg
 *
 */
public class Milk extends CondimentDecorator{

	Beverage beverage;
	
	public Milk(Beverage beverage){
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Milk";
	}

	@Override
	public double cost() {
		return .1 + beverage.cost();
	}

}
