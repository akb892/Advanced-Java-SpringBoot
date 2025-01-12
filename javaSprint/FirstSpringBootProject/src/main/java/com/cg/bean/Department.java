package com.cg.bean;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Department {
	
	@Value("${did}")
	private int deptId;
	@Value("${dname}")
	private String deptName;
	@Autowired
	private List<Employee> employees;
	public int getDeptId() {
		return deptId;
	}
	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public List<Employee> getEmployee() {
		return employees;
	}
	public void setEmployee(List<Employee> employee) {
		this.employees = employee;
	}
	
	
	public void displayDepartment() {
		System.out.println("DepartmentID = " + deptId);
		System.out.println("DepartmentName=" + deptName);
		for(Employee e : employees) {
			System.out.println(e);
		}
	}
}
