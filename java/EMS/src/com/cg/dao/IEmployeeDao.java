package com.cg.dao;

import java.util.List;

import com.cg.bean.Employee;

public interface IEmployeeDao {
	
	List<Employee> getAll();
	
	Employee findEmployee(int empid);
	
	void createEmployee(Employee o);
	
	void deleteEmployee(int empid);
	
	void updateEmployee(Employee o);
	
}
