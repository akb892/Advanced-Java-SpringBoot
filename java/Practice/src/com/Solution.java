package com;

import java.util.*;


class Student{
	private int id;
	private String fname;
	private double cgpa;
	public Student(int id, String fname, double cgpa) {
		super();
		this.id = id;
		this.fname = fname;
		this.cgpa = cgpa;
	}
	public int getId() {
		return id;
	}
	public String getFname() {
		return fname;
	}
	public double getCgpa() {
		return cgpa;
	}
}

//Complete the code
class Checker implements Comparator<Student> {
    public int compare(Student o1, Student o2) {
        if(o1.getCgpa() == o2.getCgpa()) {
            if(o2.getFname() == o1.getFname()){
                return o2.getId() - o1.getId();
            }
            else {
                o2.getFname().compareTo(o1.getFname());
            }
        }
        return Double.toString(o2.getCgpa()).compareTo(Double.toString(o1.getCgpa()));
    }
}
public class Solution
{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		
		List<Student> studentList = new ArrayList<Student>();
		while(testCases>0){
			int id = in.nextInt();
			String fname = in.next();
			double cgpa = in.nextDouble();
			
			Student st = new Student(id, fname, cgpa);
			studentList.add(st);
			
			testCases--;
		}
        studentList.sort(new Checker());
      	for(Student st: studentList){
			System.out.println(st.getFname());
		}
	}
}
