package com.fkxacg.study.designpattern.command;


/**
 * 
 * 开灯类。
 * 
 * 内含要操作的灯的对象。
 * 执行函数为调用灯的开启方法，撤销为关闭方法。
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
