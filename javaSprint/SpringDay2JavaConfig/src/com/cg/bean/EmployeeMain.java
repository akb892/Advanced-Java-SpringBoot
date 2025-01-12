package com.cg.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cg.config.JavaConfig;

public class EmployeeMain {
	public static void main(String[] args) {
		
		ApplicationContext ctx = new AnnotationConfigApplicationContext(JavaConfig.class);
		Employee e = ctx.getBean(Employee.class);
//		Employee e1 = (Employee)ctx.getBean("e");
		e.printEmployee();
//		e1.printEmployee();
	}
}
