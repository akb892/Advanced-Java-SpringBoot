package com.cg;

public class Student {
	private static Student s = null;
	private Student() {
//		super();
		System.out.println("No parameter constructor");
	}
	public static Student getStudent() {
		if(s==null) {
			s=new Student();
			return s;
		}
		return s;
	}
	
	
}
