package com.cg.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {

//	@Value("${eid}")
	private int empid;
//	@Value("${name}")
	private String name;
	
	@Autowired
	private Address address;
	
	
	public Employee() {
		
	}
	

	public Employee(int empid, String name, Address address) {
		super();
		this.empid = empid;
		this.name = name;
		this.address = address;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + ", address=" + address + "]";
	}

//	public void printEmployee() {
//		
//		System.out.println("Employee Id: " + empid);
//		System.out.println("Employee Name: " + name);
//		System.out.println("=======Address======");
//		System.out.println("City: " + address.getCity());
//		System.out.println("Country: " + address.getCountry());
//		System.out.println("City: " + address.getZip());
//	}
	
	

}
