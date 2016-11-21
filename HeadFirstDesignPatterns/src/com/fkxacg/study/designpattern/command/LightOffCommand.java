package com.fkxacg.study.designpattern.command;


/**
 * 
 * �ص��ࡣ
 * 
 * �ں�Ҫ�����ĵƵĶ���
 * ִ�к���Ϊ���õƵĹرշ���������Ϊ����������
 * 
 * @author fkxacg
 *
 */
public class LightOffCommand implements Command {

	Light light;
	
	public LightOffCommand(Light light) {
		this.light = light;
	}
	
	@Override
	public void execute() {
		light.off();
	}

	@Override
	public void undo() {
		light.on();
	}
	
}
