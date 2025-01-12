package com.cg.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.config.JavaConfig;

public class Main {
	public static void main(String[] args) {
		ApplicationContext acx = new AnnotationConfigApplicationContext(JavaConfig.class);
//		Employee h = acx.getBean(Employee.class);
//		
//		Employee h1 = (Employee)acx.getBean("h");
//		
//		h.printEmp();
		
		SBU s = acx.getBean(SBU.class);
		
		System.out.println(s);
	}
}
