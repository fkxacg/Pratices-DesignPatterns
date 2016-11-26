package com.fkxacg.study.designpattern.iterator;

import java.util.ArrayList;

/**
 * ����������ࡣ
 * ���ڴ���PancakeHouseMenu�е����ݼ����˵�����Ҳ����PancakeHouseMenuʵ������
 * �������л��һ��PancakeHouseMenu�е����ݡ�
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
