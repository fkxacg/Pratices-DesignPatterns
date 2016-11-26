package com.fkxacg.study.designpattern.iterator;

/**
 * �д��ࡣ
 * ʹ�õ�����ģʽ�Ŀͻ��ˡ�
 * 
 * 
 * @author fkxacg
 *
 */
public class Waitress {

	Menu pancakeHouseMenu;
	Menu dinerMenu;
	
	//ʵ������ʱ���������ι۵Ĳ˵�
	public Waitress(Menu pancakeHouseMenu, Menu dinerMenu) {
		this.pancakeHouseMenu = pancakeHouseMenu;
		this.dinerMenu = dinerMenu;
	}
	
	//��ӡ�˵����ֱ�������˵��л�õ�����
	public void printMenu() {
		Iterator dinerIterator = dinerMenu.createIterator();
		Iterator pancakeHouseIterator = pancakeHouseMenu.createIterator();
		
		System.out.println("BREAKFAST");
		printMenu(pancakeHouseIterator);
		
		System.out.println("LUNCH");
		printMenu(dinerIterator);
	}
	
	//�õ�����˳�������������ع��Ĳ�ͬ�ľ����������λ�����ݶ���
	public void printMenu(Iterator iterator){
		while (iterator.hasNext()) {
			MenuItem menuItem = (MenuItem)iterator.next();
			System.out.print(menuItem.getName() + ", ");
			System.out.print(menuItem.getPrice() + " -- ");
			System.out.println(menuItem.getDescription());
		}
	}
}
