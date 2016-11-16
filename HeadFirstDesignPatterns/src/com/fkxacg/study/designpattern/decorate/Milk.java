package com.fkxacg.study.designpattern.decorate;

/**
 * 牛奶。
 * 要在咖啡中加一份牛奶就用此类装饰一次。
 * 
 * 构造时需要一个被装饰对象。
 * 返回说明中在之前字符串上新增一个配料。
 * 返回价格中加上自己的价格。
 * 
 * @author fkxacg
 *
 */
public class Milk extends CondimentDecorator{

	Beverage beverage;
	
	public Milk(Beverage beverage){
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Milk";
	}

	@Override
	public double cost() {
		return .1 + beverage.cost();
	}

}
