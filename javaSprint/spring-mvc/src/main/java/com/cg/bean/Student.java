package com.cg.bean;

import org.springframework.stereotype.Component;


public class Student {
	private int sid;
	private String name;
	private int marks;
	
	
	public Student() {
		
	}


	public Student(int sid, String name, int marks) {
		super();
		this.sid = sid;
		this.name = name;
		this.marks = marks;
	}


	public int getSid() {
		return sid;
	}


	public void setSid(int sid) {
		this.sid = sid;
	}


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
	
	
}
