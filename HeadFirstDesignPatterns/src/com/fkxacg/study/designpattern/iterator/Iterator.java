package com.fkxacg.study.designpattern.iterator;

/**
 * 迭代器接口。
 * 定义迭代器需要的方法，java库中的迭代器接口相差不多，多了一个删除方法。
 * 
 * @author fkxacg
 *
 */

public interface Iterator {
	boolean hasNext();
	Object next();
}
