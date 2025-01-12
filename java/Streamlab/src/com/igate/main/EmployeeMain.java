package com.igate.main;

import java.util.Map;
import java.util.Map.Entry;

import com.igate.labs.Department;
import com.igate.service.EmployeeService;
import com.igate.streamlab.Employee;

public class EmployeeMain {

	public static void main(String[] args) {
		EmployeeService e = new EmployeeService();
		
		System.out.println("The total salary: " + e.totalSalary());
		
		
		System.out.println(e.DeptCount());
		
		e.sremp();
		
		for(String s: e.empserv()) {
			System.out.println(s);
		}
		
		for(Employee s : e.withoutDep()) {
			System.out.println(s);
		}
		
		for(Department d : e.withoutEmp()) {
			System.out.println(d);
		}
		
		System.out.println(e.highEmp());
	}

}
