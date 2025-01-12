package com;

import java.time.LocalDate;
import java.util.Scanner;

public class Employee1Main {
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter Employee ID = ");
//		int empid = sc.nextInt();
//		System.out.println("Enter Name = ");
//		String name = sc.next();
//		System.out.println("Enter DOB = ");
//		String dob = sc.next();
//		System.out.println("Enter the Gender = ");
//		String gender = sc.next();
//		Employee1 e = new Employee1(empid, name, LocalDate.parse(dob), Gender.valueOf(gender.toUpperCase()));
//		System.out.println(e);
//		sc.close();
		
		EmployeeService es = new EmployeeService();
//		es.printAllEmployee();
		Employee1 e = es.getEmployeeByID(101);
		if(e!=null) {
			System.out.println(e);
		}
		else {
			System.out.println("Employee not found");
		}
	}
}
