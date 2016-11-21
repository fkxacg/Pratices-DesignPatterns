package com.fkxacg.study.designpattern.command;


/**
 * 
 * 关灯类。
 * 
 * 内含要操作的灯的对象。
 * 执行函数为调用灯的关闭方法，撤销为开启方法。
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
