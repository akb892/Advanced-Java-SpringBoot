package com.cg.eis.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.cg.eis.bean.Employee;

public class EmployeeImp1 implements EmployeeService {
	
	Map<Integer	, Employee> employeeMap = new HashMap<>();

	@Override
	public void addEmployee(Employee emp) {
		employeeMap.put(emp.getId(), emp);
	}

	@Override
	public void deleteEmployee(int id) {
		employeeMap.remove(id);
	}

	@Override
	public List<Employee> getEmployeeByScheme(String scheme) {
		
		List<Employee> li = new ArrayList<>();
		
		for(Employee emp : employeeMap.values()) {
			if(emp.getInsuranceScheme().equalsIgnoreCase(scheme)) {
				
				li.add(emp);
			}
		}
		
		return li;
	}

	@Override
	public Employee getEmployeeId(int id) {
		return employeeMap.get(id);
	}
	
}
