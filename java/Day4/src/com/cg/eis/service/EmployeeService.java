package com.cg.eis.service;

import com.cg.eis.bean.Employee;

public interface EmployeeService {
	
	Employee getEmployeeDetails(int id, String name, double salary, String designation);
	
	String findInsuranceScheme(Employee employee);
	
	void displayEmployeeDetails(Employee employee);
}
