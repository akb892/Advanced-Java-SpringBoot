package com.cg.eis.pl;

import java.util.List;
import java.util.Scanner;

import com.cg.eis.bean.Employee;
import com.cg.eis.service.EmployeeImp1;
import com.cg.eis.service.EmployeeService;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        EmployeeService employeeService = new EmployeeImp1();

        while (true) {
            System.out.println("\nEmployee Medical Insurance Scheme");
            System.out.println("1. Add Employee");
            System.out.println("2. Display Employees by Insurance Scheme");
            System.out.println("3. Delete Employee");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {
                case 1:
                    
                    System.out.print("Enter employee ID: ");
                    int id = sc.nextInt();
                    sc.nextLine(); 
                    System.out.print("Enter employee name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter employee salary: ");
                    double salary = sc.nextDouble();
                    sc.nextLine();
                    System.out.print("Enter employee designation: ");
                    String designation = sc.nextLine();
                    Employee employee = new Employee(id, name, salary, designation);
                    employeeService.addEmployee(employee);
                    System.out.println("Employee added successfully.");
                    break;

                case 2:
                    
                    System.out.print("Enter insurance scheme (Scheme A, Scheme B, Scheme C, No Scheme): ");
                    String scheme = sc.nextLine();
                    List<Employee> employees = employeeService.getEmployeeByScheme(scheme);
                    if (employees.isEmpty()) {
                        System.out.println("No employees found with this insurance scheme.");
                    } else {
                        for (Employee emp : employees) {
                            System.out.println(emp);
                        }
                    }
                    break;

                case 3:
                    
                    System.out.print("Enter employee ID to delete: ");
                    int deleteId = sc.nextInt();
                    Employee empToDelete = employeeService.getEmployeeId(deleteId);
                    if (empToDelete != null) {
                        employeeService.deleteEmployee(deleteId);
                        System.out.println("Employee deleted successfully.");
                    } else {
                        System.out.println("Employee not found.");
                    }
                    break;

                case 4:
                    
                    System.out.println("Exiting the system.");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
	}
}
