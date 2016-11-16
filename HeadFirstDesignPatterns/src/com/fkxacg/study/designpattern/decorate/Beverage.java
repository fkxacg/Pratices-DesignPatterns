package com.fkxacg.study.designpattern.decorate;

/**
 * 
 * �����ࡣ
 * �����������Ϊ���ʹ�ã�����������̳�����
 * ��������˵���ͷ��ؼ۸�ĺ�����
 * 
 * @author fkxacg
 *
 */
public abstract class Beverage {
	String description = "Unknown Beverage";
	
	public String getDescription(){
		return description;
	}
	
	public abstract double cost();
}
