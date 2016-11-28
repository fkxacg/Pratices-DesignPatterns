package com.fkxacg.study.designpattern.state;

public class GumballMachineTestDrive {

	public static void main(String[] args) {
		GumballMachine gumballMachine = new GumballMachine(5);
		
		gumballMachine.insertQuarter();		
		gumballMachine.turnQuarter();
		
		gumballMachine.insertQuarter();		
		gumballMachine.insertQuarter();
	}
}
