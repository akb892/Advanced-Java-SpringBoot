package com.cg.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.cg.bean.Addresss;
import com.cg.bean.Employee;

@Configuration
@ComponentScan("com")
@PropertySource(value = "classpath:data.properties")
public class JavaConfig {
//	@Bean(name = "e")
//	public Employee getBean() {
////		Employee e = new Employee();
////		e.setAddress(getBean1());
////		return e;
//		return new Employee();
//	}
//	
//	@Bean(name="add")
//	public Addresss getBean1() {
//		Addresss obj = new Addresss();
//		obj.setCity("Karachi");
//		obj.setCountry("Pakistan");
//		obj.setZip(1234553);
//		return obj;
//		//return new Addresss();
//	}
//	
//	@Bean(name = "address")
//	public Addresss getBean2() {
//		Addresss obj = new Addresss();
//		obj.setCity("Gurgaon");
//		obj.setCountry("India");
//		obj.setZip(122003);
//		return obj;
////		return new Addresss();
//	}
}
