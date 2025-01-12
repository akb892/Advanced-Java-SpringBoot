package com;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeList {
	
	
	public static void main(String[] args) {
		List<Employee> li = new ArrayList<>();
		
		li.add(new Employee(1001, "Aryan", 54000.0));
		li.add(new Employee(1002, "Dipti", 44000.0));
		li.add(new Employee(1003, "Frankline", 64000.0));
		li.add(new Employee(1004, "Parushi", 34000.0));
		li.add(new Employee(1005, "Soumya", 14000.0));
		
//		Predicate<Employee> p = e->e.getPrice()>50000;
//		printEmployee(li, s1-> s1.getPrice()>50000);
//		Consumer<Employee> c = new MyEmployee()::printEmployee;
//		Consumer<Employee> c = System.out::println;
//		Consumer<Employee> c = e->System.out.println(e);
//		li.forEach(new MyEmployee()::printEmployee);
//		li.forEach(System.out::println);
		Stream<Employee> s = li.stream();
		
		s.filter(e->e.getPrice()<50000).forEach(i-> System.out.println(i));
		
//		Stream<Employee> s1 = li.stream();
		
//		double totalSalary = li.stream().map(e->e.getPrice()).collect(Collectors.summingDouble(d->d));
		double totalSalary = li.stream().collect(Collectors.summingDouble(d->d.getPrice()));
		double totalSalary1 = li.stream().map(e->e.getPrice()).reduce(0.0,(e,e1)->e+e1);
		System.out.println(totalSalary1);
		
		List<String> names = li.stream().map(e->e.getName()).collect(Collectors.toList());
		System.out.println(names);
		
		List<String> snames = li.stream().map(e->e.getName()).filter(n->n.startsWith("S")).collect(Collectors.toList());
		System.out.println(snames);
		
//		Employee e2 = li.stream().max((e,e1)-> Double.compare(e.getPrice(), e1.getPrice())).get();
//		System.out.println(e2);
		
		Employee e2 = li.stream().sorted((e,e1)-> Double.compare(e1.getPrice(), e.getPrice())).findFirst().get();
		System.out.println(e2);
		
		List<Employee> e3 = li.stream().sorted((e,e1)-> Double.compare(e1.getPrice(), e.getPrice())).limit(2).skip(1).collect(Collectors.toList());
		System.out.println(e3);
	}
	
	public static void printEmployee(List<Employee> emps, Predicate<Employee> p) {
		for(Employee e: emps) {
			if(p.test(e)) {
				System.out.println(e);
			}
		}
		
	}
}
