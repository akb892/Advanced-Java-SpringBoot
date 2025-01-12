package comm.exe;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeService {
	
	public static void main(String[] args) {
		List<Employee> li = new ArrayList<Employee>();
		
		
		li.add(new Employee(1001, "Aryan" , 100000.0, LocalDate.parse("2024-10-25")));
		li.add(new Employee(1002, "Utkarsh", 50000.0, LocalDate.parse("2024-07-11")));
		li.add(new Employee(1003, "Ishaan", 70000.0, LocalDate.parse("2024-01-07")));
		li.add(new Employee(1004, "Saket", 30000.0, LocalDate.parse("2024-01-03")));
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter how to sort it: ");
		String s = sc.next();
		
		if(s .equalsIgnoreCase("name")) {
			li.sort(new SortByName());
			System.out.println(li);
		}
		else if(s.equalsIgnoreCase("doj")) {
			li.sort(new SortByDoj());
			System.out.println(li);
		}
		else {
			li.sort(new SortBySalary());
			System.out.println(li);
		}
		
		sc.close();
	}
}
