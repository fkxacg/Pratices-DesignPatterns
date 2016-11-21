package com.fkxacg.study.designpattern.command;

/**
 * 遥控器。
 * 
 * 
 * @author fkxacg
 *
 */
public class RemoteControl {
	//保存所有的开和关命令
	Command[] onCommands;
	Command[] offCommands;
	
	//最后执行的那条命令
	Command undoCommand;
	
	public RemoteControl() {
		
		//将所有命令都指为空命令
		onCommands = new Command[7];
		offCommands = new Command[7];
		
		Command noCommand = new NoCommand();
		for (int i = 0; i < 7; i++) {
			onCommands[i] = noCommand;
			offCommands[i] = noCommand;
		}
		undoCommand = noCommand;
	}
	
	//设置命令
	public void setCommand(int slot, Command onCommand, Command offCommand) {
		onCommands[slot] = onCommand;
		offCommands[slot] = offCommand;
	}
	
	//某个位置的开按钮
	public void onButtonWasPushed(int slot){
		onCommands[slot].execute();
		undoCommand = onCommands[slot];
	}
	
	//某个位置的关按钮
	public void offButtonWasPushed(int slot){
		offCommands[slot].execute();
		undoCommand = offCommands[slot];
	}
	
	//撤销按钮
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
