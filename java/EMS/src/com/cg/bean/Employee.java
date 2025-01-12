package com.cg.bean;

import java.time.LocalDate;

public class Employee {
	private int empid;
	private String name;
	private LocalDate dob;
	private double salary;
	private String email;
	private long phone;
	
	
	public Employee() {
		
	}


	public Employee(int empid, String name, LocalDate dob, double salary, String email, long phone) {
		super();
		this.empid = empid;
		this.name = name;
		this.dob = dob;
		this.salary = salary;
		this.email = email;
		this.phone = phone;
	}


	public int getEmpid() {
		return empid;
	}


	public void setEmpid(int empid) {
		this.empid = empid;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public LocalDate getDob() {
		return dob;
	}


	public void setDob(LocalDate dob) {
		this.dob = dob;
	}


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public long getPhone() {
		return phone;
	}


	public void setPhone(long phone) {
		this.phone = phone;
	}


	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + ", dob=" + dob + ", salary=" + salary + ", email="
				+ email + ", phone=" + phone + "]";
	}
	
	
}
