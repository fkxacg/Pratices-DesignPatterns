package com.fkxacg.study.designpattern.command;

public class RemoteControlTest {
	public static void main(String[] args) {
		
		//��һ����������һ���ƣ��������úÿ�����������ҽ��������õ���������
		RemoteControl remote = new RemoteControl();
		Light light = new Light();
		LightOnCommand lightOn = new LightOnCommand(light);
		LightOffCommand lightOff = new LightOffCommand(light);
		
		remote.setCommand(0,lightOn,lightOff);

		//���������ϵİ�ť
		remote.onButtonWasPushed(0);
		remote.offButtonWasPushed(0);
		remote.undoButtonWasPushed();
		remote.onButtonWasPushed(1);
		remote.undoButtonWasPushed();
	}

}
