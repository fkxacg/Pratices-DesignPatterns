package com.fkxacg.study.designpattern.command;

/**
 * �����
 * 
 * ���ڼ��ų�null�쳣��
 * 
 * @author fkxacg
 *
 */
public class NoCommand implements Command{

	@Override
	public void execute() {  }

	@Override
	public void undo() {  }

}
