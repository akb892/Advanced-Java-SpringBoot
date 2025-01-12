package com.cg.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	
	@Value("${eid}")
	private String empid;
	@Value("${fname}")
	private String name;
	@Value("${email}")
	private String email;
	@Autowired
	@Qualifier("perAddress")
	private IAddress corAddress;
	
	
	public Employee() {
		
	}
	
//	public Employee() {
//		this.empid = "101";
//		this.name = "Aryan";
//		this.email= "aryanin2002@gmail.com";
//		//this.address = new Address("Delhi", "India", 122003);
//	}
	
	
	public String getEmpid() {
		return empid;
	}
	public void setEmpid(String empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
//	public Address getAddress() {
//		return address;
//	}
//	public void setAddress(Address address) {
//		this.address = address;
//	}
	
	
	public void printEmployee() {
		System.out.println("EmployeeId: " + empid);
		System.out.println("Name: " + name);
		System.out.println("Email: "+ email);
		System.out.println("========Address======");
//		System.out.println("City: " + address.getCity());
//		System.out.println("Country: " + address.getCountry());
//		System.out.println("City: " + address.getZip());
		
		System.out.println("City: " + corAddress.getCity());
		System.out.println("Country: " + corAddress.getCountry());
		System.out.println("Zip: " + corAddress.getZip());
	}
	
	
}
