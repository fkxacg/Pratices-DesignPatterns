package com.fkxacg.study.designpattern.command;

/**
 * 命令接口。
 * 
 * 需要被遥控器执行的命令都需实现此接口。
 * 两个方法，一个执行，一个撤销，撤销根据情况将执行的步骤反着来。
 * 
 * 
 * @author fkxacg
 *
 */
public interface Command {
	public void execute();
	public void undo();
}
