package com.fkxacg.study.designpattern.adapter;

/**
 * �����ࡣ
 * 
 * Ҫ��һ���𼦵���Ѽ��������
 * ʵ��Ѽ�ӽӿڣ��������һ��Ѽ�Ӿ����ࡣ
 * �ں�һ���𼦶��󣬴�Ϊ��ʵ����
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
