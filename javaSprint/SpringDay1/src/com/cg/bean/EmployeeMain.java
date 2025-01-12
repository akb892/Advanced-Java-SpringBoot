package com.cg.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeMain {
	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("bean.xml");
		Employee emp = ctx.getBean(Employee.class);
//		Employee emp = new Employee();
		
		emp.printEmployee();
	}
}
