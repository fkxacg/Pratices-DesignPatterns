package com.fkxacg.study.designpattern.template;

/**
 * 
 * ģ�巽���ࡣ
 * 
 * ��ģ�巽���ﰴ�����㷨ִ��һЩ��������
 * �����������Ҫ���ķ���������ʵ��
 * Ҫ�������Լ�ʵ�ֵķ�������Ϊ���󷽷�
 * 
 * ����������һЩ�շ��������������Ҫ��Ҫʵ�֡������ӣ�
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
