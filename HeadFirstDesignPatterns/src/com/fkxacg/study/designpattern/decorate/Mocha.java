package com.fkxacg.study.designpattern.decorate;

/**
 * Ħ����
 * Ҫ��Ħ������һ�ο��Ⱦ��ô���װ��һ�Ρ�
 * 
 * ����ʱ��Ҫһ����װ�ζ���
 * ����˵������֮ǰ�ַ���������һ�����ϡ�
 * ���ؼ۸��м����Լ��ļ۸�
 * 
 * @author fkxacg
 *
 */

public class Mocha extends CondimentDecorator{

	Beverage beverage;
	
	public Mocha(Beverage beverage){
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Mocha";
	}

	@Override
	public double cost() {
		return .20 + beverage.cost();
	}

}
