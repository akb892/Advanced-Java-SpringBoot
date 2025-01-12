package com.cg.bean;

public class Student {//implements Comparable<Student> {
	private String name;
	private int marks;

	public Student(String name, int marks) {
		super();
		this.name = name;
		this.marks = marks;
	}
	
	
	
//	@Override
//	public boolean equals(Object obj) {
//		if(obj instanceof Student && this.name == ((Student)obj).name) {
//			return true;
//		}
//		else {
//			return false;
//		}
//	}
//	
//	@Override
//	public int hashCode() {
//		
//		return name.length();
//	}
	
	
	

	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getMarks() {
		return marks;
	}



	public void setMarks(int marks) {
		this.marks = marks;
	}



	@Override
	public String toString() {
		return name + "\t" + marks;
	}

//	@Override
//	public int compareTo(Student o) {
//		
//		return this.name.compareTo(o.name);
//	}
	
	
	
}
