package com;

public class Employee {
	public Employee() {
		System.out.println("Constructor");
	}
	
	{
		System.out.println("Init Block");
	}
	
	static {
		System.out.println("Static Block");
	}
}
