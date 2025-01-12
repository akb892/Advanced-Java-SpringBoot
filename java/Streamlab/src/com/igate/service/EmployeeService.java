package com.igate.service;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

import com.igate.labs.Department;
import com.igate.labs.EmployeeRepository;
import com.igate.streamlab.Employee;

public class EmployeeService implements IEmployeeService {

	@Override
	public double totalSalary() {
		double sumSal = EmployeeRepository.getEmployees().stream()
				.collect(Collectors.summingDouble(e -> e.getSalary()));
		return sumSal;
	}

	@Override
	public Map<String, Long> DeptCount() {
		Map<String, Long> m = EmployeeRepository.getEmployees().stream().filter(e -> e.getDepartment() != null)
				.map(e -> e.getDepartment())
				.collect(Collectors.groupingBy(e -> e.getDepartmentName(), Collectors.counting()));
		return m;
	}

	@Override
	public void sremp() {
		Employee sr = EmployeeRepository.getEmployees().stream()
				.min((e, e1) -> e.getHireDate().compareTo(e1.getHireDate())).get();
		System.out.println(sr);
	}

	@Override
	public List<String> empserv() {
		LocalDate d = LocalDate.now();
		List<String> li = EmployeeRepository.getEmployees().stream()
				.map((e) -> e.getFirstName() + " " + e.getLastName() + " working for Months: "
						+ ChronoUnit.MONTHS.between(e.getHireDate(), d) + " and for days: "
						+ ChronoUnit.DAYS.between(e.getHireDate(), d))
				.collect(Collectors.toList());

		return li;
	}

	@Override
	public List<Employee> withoutDep() {
		List<Employee> li = EmployeeRepository.getEmployees().stream().filter((e) -> e.getDepartment() == null)
				.map((e) -> e).collect(Collectors.toList());

		return li;
	}

	@Override
	public List<Department> withoutEmp() {
		List<Department> di = EmployeeRepository
				.getDepartments().stream().filter((e) -> EmployeeRepository.getEmployees().stream()
						.filter((e2) -> e2.getDepartment() != null).noneMatch((e1) -> e1.getDepartment().equals(e)))
				.collect(Collectors.toList());
		
		return di;
	}

	@Override
	public Entry<String, Long> highEmp() {
		Entry<String , Long> en = DeptCount().entrySet().stream().max((e,e1)->e.getValue().compareTo(e1.getValue())).get();
		return en;
	}

	@Override
	public List<String> empStart() {
		Calendar c = Calendar.getInstance();
		List<Employee> li = EmployeeRepository.getEmployees().stream().map((e)->e.getFirstName() + " " + e.getLastName() + " started on: " + e.getHireDate() + " on: " + c.setTime(e.getHireDate()).get(Calendar.DAY_OF_WEEK)).toList();
	}
	
	

}
