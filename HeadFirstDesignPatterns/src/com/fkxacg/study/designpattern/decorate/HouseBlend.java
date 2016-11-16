package com.fkxacg.study.designpattern.decorate;


/**
 * 家常咖啡。
 * 具体组件，修改饮料说明和价格。
 * 
 * @author fkxacg
 *
 */
public class HouseBlend extends Beverage{

	public HouseBlend(){
		description = "House Blend Coffee";
	}
	
	@Override
	public double cost() {
		return .89;
	}

}
