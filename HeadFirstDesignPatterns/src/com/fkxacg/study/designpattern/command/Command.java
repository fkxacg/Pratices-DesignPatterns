package com.fkxacg.study.designpattern.command;

/**
 * ����ӿڡ�
 * 
 * ��Ҫ��ң����ִ�е������ʵ�ִ˽ӿڡ�
 * ����������һ��ִ�У�һ���������������������ִ�еĲ��跴������
 * 
 * 
 * @author fkxacg
 *
 */
public interface Command {
	public void execute();
	public void undo();
}
