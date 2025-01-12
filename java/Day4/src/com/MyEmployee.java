package com;

public class MyEmployee {
	
	public void calculateSalary(Object obj) {
		if(obj instanceof Ceo) {
			System.out.println("Salary of CEO is $15000");
		}
		else if(obj instanceof Manager) {
			System.out.println("Salary of Manager is $10000");
		}
		else if(obj instanceof Employee) {
			System.out.println("Salary of Employee is $5000");
		}
	}
	public static void main(String[] args) {
		MyEmployee obj = new MyEmployee();
		obj.calculateSalary(new Manager());
	}

}
