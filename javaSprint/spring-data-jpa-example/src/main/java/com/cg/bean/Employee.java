package com.cg.bean;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;


@Entity
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int empId;
	@NotNull(message = "Name should not be null")
	@NotBlank(message = "Name should not be blank")
	private String name;
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate dob;
	private double salary;
	private String department;
	@Email(message = "Invalid Email")
	private String email;
	
	public Employee() {
		
	}
	
	
	
	



	







	public Employee(int empId,
			@NotNull(message = "Name should not be null") @NotBlank(message = "Name should not be blank") String name,
			LocalDate dob, double salary, String department, @Email(message = "Invalid Email") String email) {
		super();
		this.empId = empId;
		this.name = name;
		this.dob = dob;
		this.salary = salary;
		this.department = department;
		this.email = email;
	}















	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}

	






	public String getEmail() {
		return email;
	}







	public void setEmail(String email) {
		this.email = email;
	}







	public double getSalary() {
		return salary;
	}







	public void setSalary(double salary) {
		this.salary = salary;
	}







	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", dob=" + dob + ", salary=" + salary + ", department="
				+ department + "]";
	}
	
	
	
}
