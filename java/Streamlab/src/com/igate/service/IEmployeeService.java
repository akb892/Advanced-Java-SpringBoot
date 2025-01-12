package com.igate.service;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import com.igate.labs.Department;
import com.igate.streamlab.Employee;

public interface IEmployeeService {
	
	public double totalSalary();
	
	public Map<String, Long> DeptCount();
	
	public void sremp();
	
	public List<String> empserv();
	
	public List<Employee> withoutDep();
	
	public List<Department> withoutEmp();
	
	public Entry<String, Long> highEmp();
	
	public List<String> empStart();
}
