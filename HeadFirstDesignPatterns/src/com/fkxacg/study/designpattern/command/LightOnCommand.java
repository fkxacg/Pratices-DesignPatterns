package com.fkxacg.study.designpattern.command;


/**
 * 
 * �����ࡣ
 * 
 * �ں�Ҫ�����ĵƵĶ���
 * ִ�к���Ϊ���õƵĿ�������������Ϊ�رշ�����
 * 
 * @author fkxacg
 *
 */
public class LightOnCommand implements Command{
	Light light;
	
	public LightOnCommand(Light light) {
		this.light = light;
	}

	@Override
	public void execute() {
		light.on();
	}

	@Override
	public void undo() {
		light.off();
	}
	
}
