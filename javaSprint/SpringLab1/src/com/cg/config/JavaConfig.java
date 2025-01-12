package com.cg.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.cg.bean.Employee;
import com.cg.bean.SBU;

@Configuration

public class JavaConfig {

	
	@Bean
	public Employee getBean() {
		Employee e = new Employee();
		e.setEmpId(12345);
		e.setEmName("Harriet");
		e.setSalary(40000);
		e.setBuName("PES-BU");
		e.setAge(30);
		
		return e;
	}
	
	

	@Bean(name = "h")
	public Employee getBean2() {
		Employee e = new Employee();
		e.setEmpId(6789);
		e.setEmName("Aryan");
		e.setSalary(60000);
		e.setBuName("PES-BU");
		e.setAge(22);
		
		return e;
	}
	
	@Bean
	public SBU getBean1() {
		SBU a = new SBU();
		a.setSbuHead("Kiran Rao");
		a.setSbuId(10);
		a.setSbuName("Product Engineering Services");
		List<Employee> li=new ArrayList<>();
		li.add(getBean());
		li.add(getBean2());
		a.setEmployees(li);
		return a;
	}
}
