package com.cg.service;

import com.cg.bean.Employee;
import com.cg.repo.EmployeeRepo;

public class EmployeeService {
	public void printAllEmployee() {
		for(Employee emp : EmployeeRepo.getEmployees()) {
			System.out.println(emp);
		}
	}
	
	public void addEmployee(Employee emp) {
		EmployeeRepo.getEmployees().add(emp);
	}
	
	public void removeEmployee(Employee emp) {
		Employee e1 = null;
		for(Employee e: EmployeeRepo.getEmployees()) {
			if(e.getEmpid() == emp.getEmpid()) {
				e1 = e;
				break;
			}
		}
		EmployeeRepo.getEmployees().remove(e1);
	}
	public void printEmployeeById(int eid) {
		for(Employee e : EmployeeRepo.getEmployees()) {
			if(e.getEmpid() == eid) {
				System.out.println(e);
			}
		}
	}
	
	public void updateEmployeeSalary(int eid, double salary) {
		for(Employee e : EmployeeRepo.getEmployees()) {
			if(e.getEmpid() == eid) {
				e.setSalary(salary);
			}
		}
		
	}
}
