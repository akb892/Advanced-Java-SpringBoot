package com.cg.main;

import java.time.LocalDate;

import com.cg.bean.Employee;
import com.cg.dao.EmployeeDao;
import com.cg.dao.IEmployeeDao;

public class EmployeeMain {

	public static void main(String[] args) {
		IEmployeeDao e = new EmployeeDao();
		
		System.out.println(e.getAll());
		e.getAll().stream().forEach(System.out::println);
		System.out.println();
		
		e.createEmployee(new Employee(105, "Aman",LocalDate.of(2002, 07, 02), 18700.00, "aman123@gmail.com", 9876543210L));
		e.getAll().stream().forEach(System.out::println);
		System.out.println();
		
		e.deleteEmployee(105);
		e.getAll().stream().forEach(System.out::println);
		System.out.println();
		
		e.updateEmployee(new Employee(104, "Aryan",LocalDate.of(2002, 06, 06), 80000, "aryanin2002@gmail.com", 9876543210L));
		e.getAll().stream().forEach(System.out::println);
		
	}

}
