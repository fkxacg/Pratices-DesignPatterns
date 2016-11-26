package com.fkxacg.study.designpattern.iterator;

/**
 * 菜单类。
 * 聚合类接口。
 * 这里只有一个方法，用于获得一个迭代器。
 * 
 * @author fkxacg
 *
 */
public interface Menu {
	public Iterator createIterator();
}
