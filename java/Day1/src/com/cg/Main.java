package com.cg;

public class Main {
	public static void main(String[] args) {
//		Hello h = new Hello();
		Employee emp = new Employee();
		System.out.println(emp.getEmpid());
		System.out.println(emp.getName());
		System.out.println(emp.getAge());
		
		emp.printEmployee();	
	}
}
