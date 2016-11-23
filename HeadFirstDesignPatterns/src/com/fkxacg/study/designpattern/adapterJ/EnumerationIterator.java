package com.fkxacg.study.designpattern.adapterJ;

import java.util.Enumeration;
import java.util.Iterator;

public class EnumerationIterator implements Iterator{

	Enumeration e;
	
	@Override
	public boolean hasNext() {
		return e.hasMoreElements();
	}

	@Override
	public Object next() {
		return e.nextElement();
	}

	//无法实现的功能，抛出一个异常
	@Override
	public void remove() {
		throw new UnsupportedOperationException();
	}

}
