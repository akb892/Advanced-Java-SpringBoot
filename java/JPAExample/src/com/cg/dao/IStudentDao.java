package com.cg.dao;

import java.util.List;

import com.cg.bean.Student;

public interface IStudentDao {
	
	void createStudent(Student o);
	Student getStudent(int sid);
	List<Student> getAll();
	void deleteStudent(int sid);
	void updateStudent(Student o);
}
