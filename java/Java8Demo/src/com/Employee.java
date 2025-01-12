package com;

public class Employee {

	int empid;
	String name;
	double price;
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
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Employee(int empid, String name, double price) {
		super();
		this.empid = empid;
		this.name = name;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + ", price=" + price + "]";
	}
	
	
}
