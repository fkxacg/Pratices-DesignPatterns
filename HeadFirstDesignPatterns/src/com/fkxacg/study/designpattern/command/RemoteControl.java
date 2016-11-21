package com.fkxacg.study.designpattern.command;

/**
 * ң������
 * 
 * 
 * @author fkxacg
 *
 */
public class RemoteControl {
	//�������еĿ��͹�����
	Command[] onCommands;
	Command[] offCommands;
	
	//���ִ�е���������
	Command undoCommand;
	
	public RemoteControl() {
		
		//���������ָΪ������
		onCommands = new Command[7];
		offCommands = new Command[7];
		
		Command noCommand = new NoCommand();
		for (int i = 0; i < 7; i++) {
			onCommands[i] = noCommand;
			offCommands[i] = noCommand;
		}
		undoCommand = noCommand;
	}
	
	//��������
	public void setCommand(int slot, Command onCommand, Command offCommand) {
		onCommands[slot] = onCommand;
		offCommands[slot] = offCommand;
	}
	
	//ĳ��λ�õĿ���ť
	public void onButtonWasPushed(int slot){
		onCommands[slot].execute();
		undoCommand = onCommands[slot];
	}
	
	//ĳ��λ�õĹذ�ť
	public void offButtonWasPushed(int slot){
		offCommands[slot].execute();
		undoCommand = offCommands[slot];
	}
	
	//������ť
	public void undoButtonWasPushed() {
		undoCommand.undo();
	}
	
	public String toString() {
		StringBuffer stringBuff = new StringBuffer();
		stringBuff.append("\n---- Remote Control ----\n");
		for (int i = 0; i < onCommands.length; i++) {
			stringBuff.append("[slot " + i + "] " + onCommands[i].getClass().getName()
					+ "    " + offCommands[i].getClass().getName() + "\n");
		}
		return stringBuff.toString();
	}

}
