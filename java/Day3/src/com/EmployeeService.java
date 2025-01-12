package com;

//import java.util.Arrays;

public class EmployeeService {
	public void printAllEmployee() {
		for(Employee1 e: EmployeeRepo.getEmployees()) {
			System.out.println(e);
		}
//		System.out.println(Arrays.deepToString(EmployeeRepo.getEmployees()));
	}
	
	
	public Employee1 getEmployeeByID(int eid) {
		for(Employee1 e: EmployeeRepo.getEmployees()) {
			if(e.getEmpid() == eid) {
				return e;
			}
			
		}
		return null;
	}
}
