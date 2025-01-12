package com;

public class Employee {

	public void salary() {
		System.out.println("Employee Salary");
	}
}

class Manager extends Employee {
	@Override
	public void salary() {
		System.out.println("Manager Salary");
	}
}

class Ceo extends Manager {
	@Override
	public void salary() {
		System.out.println("Ceo Salary");
	}
}
