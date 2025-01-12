package com.cg;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;

import com.cg.bean.Address;
import com.cg.bean.Department;
import com.cg.bean.Employee;

@SpringBootApplication
@PropertySource(value = "classpath:data.properties")
public class FirstSpringBootProjectApplication {

	public static void main(String[] args) {
		ApplicationContext acx =  SpringApplication.run(FirstSpringBootProjectApplication.class, args);
		Employee e = acx.getBean(Employee.class);
		
		Department d = acx.getBean(Department.class);
		
		d.displayDepartment();
		
	
	}
	
	
	@Bean(name="employees")
	protected List<Employee> getEmps() {
		List<Employee> li = new ArrayList<>();
		
		li.add(new Employee(1,"Aryan", new Address("Gurgaon","India", 122003)));
		li.add(new Employee(1,"Paryushi", new Address("Gurgaon","India", 122018)));
		li.add(new Employee(1,"Frankline", new Address("Faridabad","India", 123005)));
		li.add(new Employee(1,"Dipti", new Address("Ahemdabad","India", 200045)));
		return li;
	}

}
