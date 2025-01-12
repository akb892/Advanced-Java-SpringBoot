package com.cg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.bean.Employee;
import com.cg.exception.EmployeeNotFoundException;
import com.cg.service.IEmployeeService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("employees")
public class EmployeeAPI {

	@Autowired
	private IEmployeeService service;
	
	
	@GetMapping("/getall")
	public List<Employee> getAll(){
		return service.getAllEmployee();
	}
	
//	@GetMapping("/getbyId/{id}")
//	public Employee getEmployeeById(@PathVariable int id) {
//		return service.getEmployeeByID(id);
//	}
	
	@GetMapping("/getbyId/{id}")
	public ResponseEntity<Employee> getEmployeeById(@PathVariable int id) throws EmployeeNotFoundException {
		Employee e = service.getEmployeeByID(id);
		return new ResponseEntity<Employee>(e,HttpStatus.OK);
//		else
//			return new ResponseEntity("Employee Not Found",HttpStatus.NOT_FOUND);
	}
	
	@GetMapping("/getByDept/{dept}")
	public List<Employee> getEmployeeByDept(@PathVariable String dept){
		return service.getEmployeeByDepartment(dept);
	}
	
	@DeleteMapping("/deletebyId/{empid}")
	public void removeEmp(@PathVariable int empid) {
		service.removeEmployee(empid);
	}
	
	@PostMapping("/createEmp")
	public void createEmp(@RequestBody @Valid Employee e) {
		service.createEmployee(e);
	}
	
	@PutMapping("/updateEmp/{empid}")
	public void updateEmp(@RequestBody Employee e, @PathVariable int empid) throws EmployeeNotFoundException {
		e.setEmpId(empid);
		service.updateEmployee(e);
	}
	
}
