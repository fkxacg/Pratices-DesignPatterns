package com.fkxacg.study.designpattern.iterator;

/**
 * 数据对象。
 * 作为一个稍复杂的具体数据项使用。
 * 
 * @author fkxacg
 *
 */
public class MenuItem {

	String name;
	String description;
	boolean vegetarian;
	double price;
	
	public MenuItem(String name, String description, boolean vegetarian, double price) {
		this.name = name;
		this.description = description;
		this.vegetarian = vegetarian;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public boolean isVegetarian() {
		return vegetarian;
	}

	public double getPrice() {
		return price;
	}
	
	
}
