package com.cg;

public class Employee {
	private int empid = 101;
	private String name = "Aryan";
	private int age = 22;
	
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getEmpid() {
		return empid;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	
	public void printEmployee() {
		System.out.println("Emp id=" + empid);
		int salary = 200000;
		System.out.println("Salary= " + salary);
	}
	
	
}
