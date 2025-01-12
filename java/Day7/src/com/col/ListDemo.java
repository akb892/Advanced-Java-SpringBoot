package com.col;

import java.util.ArrayList;
import java.util.List;

import com.cg.bean.Employee;

public class ListDemo {
//	@SuppressWarnings("all")
//	public static void display(List<String> li) {
//		li.add("Saurabh");
//		System.out.println(li);
//	}
	public static void main(String[] args) {
//		List li = new ArrayList();
//		li.add(23);
//		li.add(12.33);
//		li.add(false);
//		li.add("Aryan");
//		
////		System.out.println(li);
//		
//		for(Object ob : li) {
//			if(ob instanceof String) {
//				String str = (String)ob;
//				System.out.println(str);
//			}
//			else if(ob instanceof Integer) {
//				int a = (Integer)ob;
//				System.out.println(a);
//			}
//			
//		}
		
		
//		List<String> li = new ArrayList<String>();
//		li.add("Aryan");
//		li.add("Utkarsh");
//		
//		for(String s:li) {
//			System.out.println(s);
//		}
		
//		List li = new ArrayList();
//		li .add(12);
//		li .add(12.33);
//		li.add(false);
//		
//		display(li);
		
		
//		List<String> li = new ArrayList<String>();
//		li.add("Amit");
//		li.add("Shweta");
//		li.add("Shridhi");
//		li.add("Ankan");
//		li.add("Binod");
		
//		
//		System.out.println(li.get(4));
//		System.out.println(li.size());
//		li.remove(4);
//		System.out.println(li);
		
		
//		List<String> li1 = new ArrayList<String>();
//		li1.add("Amit");
//		li1.add("Shweta");
//		li1.add("Binod");
//		li1.add("Saurabh");
//		
////		System.out.println(li);
////		li.removeAll(li1);
////		System.out.println(li);
////		li.retainAll(li1);
////		System.out.println(li);
//		
////		li.addAll(li1);
////		System.out.println(li);
//		
//		
//		boolean b = li.contains(li1);
//		System.out.println(b);
//		
//		Object ob[] = li.toArray();
		
		List<Employee> li = new ArrayList<Employee>();
		li.add(new Employee(1001, "Aryan", 98000));
		li.add(new Employee(1002, "Amit", 88000));
		li.add(new Employee(1003, "Rahul", 48000));
		li.add(new Employee(1004, "Atul", 120000));
		
		
		for(Employee e: li) {
			System.out.println(e.toString());
		}
	}
}
