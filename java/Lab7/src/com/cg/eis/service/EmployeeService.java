package com.cg.eis.service;

import java.util.List;

import com.cg.eis.bean.Employee;

public interface EmployeeService {
	
	void addEmployee(Employee emp);
	
	void deleteEmployee(int id);
	
	List<Employee> getEmployeeByScheme(String scheme);
	
	Employee getEmployeeId(int id);
	
	
}
