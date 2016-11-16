package com.fkxacg.study.designpattern.decorate;

/**
 * 浓缩咖啡。
 * 具体组件，修改饮料说明和价格。
 * 
 * @author fkxacg
 *
 */
public class Espresso extends Beverage{

	public Espresso(){
		this.description = "Espresso";
	}
	
	@Override
	public double cost() {
		return 1.99;
	}

}
