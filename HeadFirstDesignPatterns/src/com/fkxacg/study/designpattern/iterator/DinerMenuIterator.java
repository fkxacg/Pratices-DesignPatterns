package com.fkxacg.study.designpattern.iterator;


/**
 * 具体迭代器类。
 * 用于处理DinerMenu中的数据集，此迭代器也将有DinerMenu实例化。
 * 构造器中获得一份DinerMenu中的数据。
 * 
 * @author fkxacg
 *
 */
public class DinerMenuIterator implements Iterator{
	MenuItem[] items;
	int position = 0;
	
	public DinerMenuIterator(MenuItem[] items) {
		this.items = items;
	}
	
	@Override
	public Object next() {
		MenuItem menuItem = items[position];
		position = position +1;
		return menuItem;
	}
	
	@Override
	public boolean hasNext() {
		if (position >= items.length || items[position] == null){
			return false;
		} else {
			return true;
		}
	}
	
}
