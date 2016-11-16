package com.fkxacg.study.designpattern.decorate;

/**
 * 摩卡。
 * 要用摩卡处理一次咖啡就用此类装饰一次。
 * 
 * 构造时需要一个被装饰对象。
 * 返回说明中在之前字符串上新增一个配料。
 * 返回价格中加上自己的价格。
 * 
 * @author fkxacg
 *
 */

public class Mocha extends CondimentDecorator{

	Beverage beverage;
	
	public Mocha(Beverage beverage){
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Mocha";
	}

	@Override
	public double cost() {
		return .20 + beverage.cost();
	}

}
