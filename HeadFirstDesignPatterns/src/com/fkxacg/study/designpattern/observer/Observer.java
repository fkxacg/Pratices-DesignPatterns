package com.fkxacg.study.designpattern.observer;

/**
 * �۲��߽ӿڡ�
 * 
 * ���и��º��������ܴӱ��۲��ߴ�������ֵ�������Լ���״̬��
 * �˴������Ƕ���õģ�֮����ʹ�ñ��۲��ߵĶ����ר����Ķ���
 * 
 * @author fkxacg
 *
 */

public interface Observer {
	public void update(float temp, float humidity, float pressure);
}
