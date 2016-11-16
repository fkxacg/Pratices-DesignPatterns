package com.fkxacg.study.designpattern.decorate;

/**
 * Ũ�����ȡ�
 * ����������޸�����˵���ͼ۸�
 * 
 * @author fkxacg
 *
 */
public class Espresso extends Beverage{

	public Espresso(){
		this.description = "Espresso";
	}
	
	@Override
	public double cost() {
		return 1.99;
	}

}
