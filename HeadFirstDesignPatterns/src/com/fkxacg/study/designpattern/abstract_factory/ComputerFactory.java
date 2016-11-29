package com.fkxacg.study.designpattern.abstract_factory;

/**
 * 工厂接口
 * @author fkxacg
 *
 */
public interface ComputerFactory {
	public Mouse createMouse();
	public Keyboard createKeyboard();

}
