package com.fkxacg.study.designpattern.factory_method;

public class Client {
	public static void main(String[] args) {
		Company apple = new Apple();
		Company google = new Google();
		
		Phone iphone = apple.createPhone();
		Phone nexus = google.createPhone();
		
		iphone.display();
		nexus.display();
	}

}
