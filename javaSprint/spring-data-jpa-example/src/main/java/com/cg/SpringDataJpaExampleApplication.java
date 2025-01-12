package com.cg;

import java.time.LocalDate;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cg.bean.Employee;
import com.cg.service.EmployeeService;
import com.cg.service.IEmployeeService;

@SpringBootApplication
public class SpringDataJpaExampleApplication {
	static Logger logger = LoggerFactory.getLogger(SpringDataJpaExampleApplication.class);
	public static void main(String[] args) {
		//ApplicationContext acx = SpringApplication.run(SpringDataJpaExampleApplication.class, args);
		SpringApplication.run(SpringDataJpaExampleApplication.class, args);
		//System.out.println("Connected with mysql Database");
//		logger.info("Connected with mysql Database");
//		IEmployeeService es = acx.getBean(EmployeeService.class);
		//es.createEmployee(new Employee("Dipti",LocalDate.of(2002,9,28), 30000, "Admin"));
		
		//es.getAllEmployee().forEach(System.out::println);
		
//		Employee e = es.getEmployeeByID(4);
//		System.out.println(e);
//		
//		Employee e1 = new Employee("Raju", LocalDate.of(2002, 05, 29),40000,"Admin");
//		e1.setEmpId(4);
//		es.updateEmployee(e1);
//		
//		
//		Employee e2 = es.getEmployeeByID(4);
//		System.out.println(e2);
		
		//System.out.println(es.getEmployeeByName("A"));
		
		
		
	}

}
