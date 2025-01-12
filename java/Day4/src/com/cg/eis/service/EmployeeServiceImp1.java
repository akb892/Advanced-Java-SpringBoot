package com.cg.eis.service;

import com.cg.eis.bean.Employee;

public class EmployeeServiceImp1 implements EmployeeService {

	@Override
	public Employee getEmployeeDetails(int id, String name, double salary, String designation) {
		return new Employee(id,name,salary,designation);
	}

	@Override
	public String findInsuranceScheme(Employee employee) {
		
		return employee.getInsuranceScheme();
	}

	@Override
	public void displayEmployeeDetails(Employee employee) {
		System.out.println(employee.toString());
	}
	
}
