package com.fkxacg.study.designpattern.command;

/**
 * 空命令。
 * 
 * 用于简单排除null异常。
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
