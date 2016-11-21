package com.fkxacg.study.designpattern.command;

public class RemoteControlTest {
	public static void main(String[] args) {
		
		//拿一个控制器，一个灯，给灯设置好开、关命令，并且将命令设置到控制器上
		RemoteControl remote = new RemoteControl();
		Light light = new Light();
		LightOnCommand lightOn = new LightOnCommand(light);
		LightOffCommand lightOff = new LightOffCommand(light);
		
		remote.setCommand(0,lightOn,lightOff);

		//按控制器上的按钮
		remote.onButtonWasPushed(0);
		remote.offButtonWasPushed(0);
		remote.undoButtonWasPushed();
		remote.onButtonWasPushed(1);
		remote.undoButtonWasPushed();
	}

}
