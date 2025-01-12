package Main;

import com.cg.bean.Employee;
import com.cg.service.EmployeeService;

public class ListDemo {
	
	public static void main(String[] args) {
		EmployeeService es = new EmployeeService();
		Employee emp = new Employee(1005, "Utkarsh", 20000);
		es.addEmployee(emp);
		es.printAllEmployee();
		System.out.println();
		
		
		es.removeEmployee(new Employee(1002, "Amit", 88000));
		es.printAllEmployee();
		System.out.println();
		es.printEmployeeById(1003);
		System.out.println();
		es.updateEmployeeSalary(1003, 30000);
		es.printAllEmployee();
	}
}
