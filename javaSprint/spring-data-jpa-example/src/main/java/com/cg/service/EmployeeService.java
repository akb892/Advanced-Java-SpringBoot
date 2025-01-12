package com.cg.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.bean.Employee;
import com.cg.dao.IEmployeeRepo;
import com.cg.exception.EmployeeNotFoundException;


@Service
public class EmployeeService implements IEmployeeService {
	
	@Autowired
	private IEmployeeRepo repo;
	public void createEmployee(Employee emp) {
		repo.saveAndFlush(emp);
		System.out.println("Employee Created....");
	}
	@Override
	public List<Employee> getAllEmployee() {
		
		return repo.findAll();
	}
	@Override
	public Employee getEmployeeByID(int empid) throws EmployeeNotFoundException {
		Optional<Employee> op = repo.findById(empid);
		if(op.isEmpty()) {
			throw new EmployeeNotFoundException("Employee with "+ empid+ " is not present");
		}
		else {
			return op.get();
		}
		
//		return repo.getById(empid);
//		return repo.findByEmpId(empid);
	}
	@Override
	public List<Employee> getEmployeeByDepartment(String dept) {
		
		
		return repo.findByDepartment(dept);
	}
	@Override
	public void removeEmployee(int empid) {
		// TODO Auto-generated method stub
		repo.deleteById(empid);
	}
	@Override
	public void updateEmployee(Employee e) throws EmployeeNotFoundException {
		// TODO Auto-generated method stub
		Employee emp = getEmployeeByID(e.getEmpId());
		if(emp == null) {
			throw new EmployeeNotFoundException("Employee with "+ e + " not present");
		}
		emp.setName(e.getName());
		repo.saveAndFlush(emp);
	}
	@Override
	public List<Employee> getEmployeeByName(String name) {
		return repo.startsWithName(name);
	}
}
