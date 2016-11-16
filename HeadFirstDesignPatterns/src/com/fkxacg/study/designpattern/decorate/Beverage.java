package com.fkxacg.study.designpattern.decorate;

/**
 * 
 * 饮料类。
 * 顶级组件，作为句柄使用，并且所有类继承它。
 * 包含自身说明和返回价格的函数。
 * 
 * @author fkxacg
 *
 */
public abstract class Beverage {
	String description = "Unknown Beverage";
	
	public String getDescription(){
		return description;
	}
	
	public abstract double cost();
}
