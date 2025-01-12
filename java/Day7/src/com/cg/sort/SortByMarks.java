package com.cg.sort;

import java.util.Comparator;

import com.cg.bean.Student;

public class SortByMarks implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return o1.getMarks() - o2.getMarks();
	}
	
}
