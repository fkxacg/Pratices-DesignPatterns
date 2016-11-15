package com.fkxacg.study.designpattern.observer;

/**
 * ���۲��߽ӿڣ�Ҳ�����⡣
 * 
 * ������ӡ�ɾ����֪ͨ�۲��ߡ�
 * 
 * @author fkxacg
 *
 */

public interface Subject {
	public void registerObserver(Observer o);
	public void removeObserver(Observer o);
	public void notifyObservers();
}
