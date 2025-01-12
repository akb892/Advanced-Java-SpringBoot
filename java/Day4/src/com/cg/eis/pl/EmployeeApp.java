package com.cg.eis.pl;

import java.util.Scanner;

import com.cg.eis.bean.Employee;
import com.cg.eis.service.EmployeeService;
import com.cg.eis.service.EmployeeServiceImp1;

public class EmployeeApp {
	
	public static void main(String[] args) {
		EmployeeService employeeService  = new EmployeeServiceImp1();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();
        sc.nextLine();  // Consume newline

        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Employee Salary: ");
        double salary = sc.nextDouble();
        sc.nextLine();  // Consume newline

        System.out.print("Enter Employee Designation: ");
        String designation = sc.nextLine();

        // Get employee details
        Employee employee = employeeService.getEmployeeDetails(id, name, salary, designation);

        // Display the insurance scheme
        System.out.println("Insurance Scheme: " + employeeService.findInsuranceScheme(employee));

        // Display all employee details
        employeeService.displayEmployeeDetails(employee);

        // Close scanner
        sc.close();
		
	}
}
