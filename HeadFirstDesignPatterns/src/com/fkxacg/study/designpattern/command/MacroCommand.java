package com.fkxacg.study.designpattern.command;

/**
 * 宏命令。
 * 
 * 保存一组命令，执行时按顺序执行。
 * 
 * @author fkxacg
 *
 */
public class MacroCommand implements Command {

	Command[] commands;
	
	public MacroCommand(Command[] commands) {
		this.commands = commands;
	}
	
	@Override
	public void execute() {
		for (int i = 0; i < commands.length; i++) {
			commands[i].execute();
		}
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		
	}

}
