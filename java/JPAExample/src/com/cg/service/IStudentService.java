package com.cg.service;

import java.util.List;

import com.cg.bean.Student;

public interface IStudentService {
	
	String saveStudent(Student o);
	Student findStudent(int sid);
	List<Student> getAllStudent();
	String updateStudent(Student o);
	String deleteStudent(int sid);
}
