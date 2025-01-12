package com;

import java.time.LocalDate;

public class EmployeeRepo {
	static Employee1 emp[];
	static {
		emp = new Employee1[]{new Employee1(101, "Mohit", LocalDate.of(1987, 10, 12), Gender.MALE),
				new Employee1(102, "Aryan", LocalDate.of(2002, 06, 06), Gender.MALE)
		};
	}
	
	public static Employee1[] getEmployees() {
		return emp;
	}
}
