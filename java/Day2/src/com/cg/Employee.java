package com.cg;

public class Employee {

	public Employee() {
		this(22);
		System.out.println("Employee");
	}
	
	public Employee(String name) {
		this(34);
		System.out.println("Employee parametrized");
	}
	
	public Employee(int age) {
		System.out.println(age);
	}
}
