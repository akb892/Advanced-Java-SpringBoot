package com.cg.eis.bean;

public class Employee {
	
	private int id;
	private String name;
	private double salary;
	private String designation;
	private String insuranceScheme;
	
	public Employee() {
		this(0000, "default name", 0000.0, "default designation");
	}
	
	
	
	public Employee(int id, String name, double salary, String designation) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.designation = designation;
		this.insuranceScheme = determineInsurance(salary, designation);
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
		this.insuranceScheme = determineInsurance(salary, this.designation);
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
		this.insuranceScheme = determineInsurance(this.salary, designation);
	}
	public String getInsuranceScheme() {
		return insuranceScheme;
	}
	
	private String determineInsurance(double Salary, String designation) {
		
		if(salary > 5000 && salary < 20000 && designation.equalsIgnoreCase("System Associate")) {
			return "Scheme C";
		}
		else if(salary >= 20000 && salary <40000 && designation.equalsIgnoreCase("Programmer")) {
			return "Scheme B";
		}
		else if(salary >= 40000 && designation.equalsIgnoreCase("Manager")) {
			return "Scheme A";
		}
		
		else if(salary < 5000) {
			return "No Scheme";
		}
		
		return "No Scheme";
	}
	
	
	
}
