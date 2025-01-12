package com.cg.eis.exception;

import java.util.Scanner;

public class EXE3 {

	public static void checkSalary(double salary) throws EmployeeException {
		if(salary < 3000) {
			throw new EmployeeException("Salary of the employee is below 3000");
		}
		else {
			System.out.println("Salary of the employee is: " + salary);
		}
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the salary: ");
		double salary = sc.nextDouble();
		
		
		try {
			checkSalary(salary);
		}
		catch (EmployeeException w) {
			System.out.println(w.getMessage());
		}
		finally {
			sc.close();
		}
	}
}
