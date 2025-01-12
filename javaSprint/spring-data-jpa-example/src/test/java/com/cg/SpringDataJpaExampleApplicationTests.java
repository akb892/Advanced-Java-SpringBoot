package com.cg;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.when;

import java.time.LocalDate;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.cg.bean.Employee;
import com.cg.dao.IEmployeeRepo;
import com.cg.exception.EmployeeNotFoundException;
import com.cg.service.EmployeeService;
//import com.cg.service.IEmployeeService;

@SpringBootTest
class SpringDataJpaExampleApplicationTests {

	
	@Mock
	private IEmployeeRepo repo;
	@InjectMocks
	private EmployeeService serv;
	
	
	@Test
	void checkEmployeeWithValidId() throws EmployeeNotFoundException {
		Employee emp = new Employee(101,"Aryan",LocalDate.now(),56000,"aryanin2002@gmail.com","IT");
		Optional<Employee> op = Optional.of(emp);
		
		when(repo.findById(101)).thenReturn(op);
		assertNotNull(serv.getEmployeeByID(101));
		assertEquals("Aryan", serv.getEmployeeByID(101).getName());
	}
	
//	@Test
//	void checkEmployeeWithInvalidId() throws EmployeeNotFoundException {
//		assertThrows(EmployeeNotFoundException.class,()->serv.getEmployeeByID(15));
//		assertEquals("Saurabh", serv.getEmployeeByID(5).getName());
//	}
}
