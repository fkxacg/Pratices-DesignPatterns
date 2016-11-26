package com.fkxacg.study.designpattern.iterator;

import java.util.ArrayList;

/**
 * 具体迭代器类。
 * 用于处理PancakeHouseMenu中的数据集，此迭代器也将有PancakeHouseMenu实例化。
 * 构造器中获得一份PancakeHouseMenu中的数据。
 * 
 * @author fkxacg
 *
 */
public class PancakeHouseMenuIterator implements Iterator{
	ArrayList items;
	int position = 0;

	public PancakeHouseMenuIterator(ArrayList items) {
		this.items = items;
	}

	@Override
	public boolean hasNext() {
		if (position >= items.size() || items.get(position) == null){
			return false;
		} else {
			return true;
		}
	}

	@Override
	public Object next() {
		MenuItem menuItem = (MenuItem) items.get(position);
		position = position + 1;
		return menuItem;
	}
}
