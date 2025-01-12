package com.cg.service;

import java.util.List;

import com.cg.bean.Student;
import com.cg.dao.IStudentDao;
import com.cg.dao.StudentDao;

public class StudentServiceImp implements IStudentService {
	IStudentDao dao = new StudentDao();
	@Override
	public String saveStudent(Student o) {
		if(o.getSid() == 0 || o.getName() == null || o.getName().isBlank()) {
			return "Invalid Student Data";
		}
		else {
			dao.createStudent(o);
			return "Student Created..";
		}
	}

	@Override
	public Student findStudent(int sid) {
		return dao.getStudent(sid);
	}

	@Override
	public List<Student> getAllStudent() {
		// TODO Auto-generated method stub
		return dao.getAll();
	}

	@Override
	public String updateStudent(Student o) {
		Student s = findStudent(o.getSid());
		if(s != null) {
			dao.updateStudent(o);
			return "Student Updated";
		}
		else {
			return "Student Not present";
		}
	}

	@Override
	public String deleteStudent(int sid) {
		Student o = findStudent(sid);
		if(o != null) {
			dao.deleteStudent(sid);
			return "Student Deleted Successfully";
		}
		else {
			return "Student not present";
		}
	}

}
