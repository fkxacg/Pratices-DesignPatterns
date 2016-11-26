package com.fkxacg.study.designpattern.iterator;

/**
 * 招待类。
 * 使用迭代器模式的客户端。
 * 
 * 
 * @author fkxacg
 *
 */
public class Waitress {

	Menu pancakeHouseMenu;
	Menu dinerMenu;
	
	//实例化的时候获得两个参观的菜单
	public Waitress(Menu pancakeHouseMenu, Menu dinerMenu) {
		this.pancakeHouseMenu = pancakeHouseMenu;
		this.dinerMenu = dinerMenu;
	}
	
	//打印菜单，分别从两个菜单中获得迭代器
	public void printMenu() {
		Iterator dinerIterator = dinerMenu.createIterator();
		Iterator pancakeHouseIterator = pancakeHouseMenu.createIterator();
		
		System.out.println("BREAKFAST");
		printMenu(pancakeHouseIterator);
		
		System.out.println("LUNCH");
		printMenu(dinerIterator);
	}
	
	//用迭代器顺序输出数据项，不必关心不同的具体迭代器如何获得数据对象
	public void printMenu(Iterator iterator){
		while (iterator.hasNext()) {
			MenuItem menuItem = (MenuItem)iterator.next();
			System.out.print(menuItem.getName() + ", ");
			System.out.print(menuItem.getPrice() + " -- ");
			System.out.println(menuItem.getDescription());
		}
	}
}
