package com.cg.bean;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {
	
	private int empId;
	private String emName;
	private double salary;
	private String buName;
	private int age;
	
//	@Autowired
//	private SBU businessUnit;
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmName() {
		return emName;
	}
	public void setEmName(String emName) {
		this.emName = emName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getBuName() {
		return buName;
	}
	public void setBuName(String buName) {
		this.buName = buName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	
	
	public void printEmp() {
		System.out.println("Employee Details");
		System.out.println("----------------------------");
		System.out.println("Employee ID : " + empId);
		System.out.println("Employee Name : " + emName);
		System.out.println("Employee Salary : " + salary);
//		System.out.println("Employee BU : " + buName);
		System.out.println("Employee Age : " + age);
		
//		System.out.println(getSbuDetails());
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", emName=" + emName + ", salary=" + salary + ", age=" + age + "]";
	}
	
//	public SBU getSbuDetails() {
//		return businessUnit;
//	}
	
}
