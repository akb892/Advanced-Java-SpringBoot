package com.cg.service;

import java.util.List;

import com.cg.bean.Employee;
import com.cg.exception.EmployeeNotFoundException;

public interface IEmployeeService {
	 void createEmployee(Employee e);
	 List<Employee> getAllEmployee();
	 Employee getEmployeeByID(int empid) throws EmployeeNotFoundException;
	 List<Employee> getEmployeeByDepartment(String dept);
	 void removeEmployee(int empid);
	 void updateEmployee(Employee e) throws EmployeeNotFoundException;
	 List<Employee> getEmployeeByName(String name);
}
