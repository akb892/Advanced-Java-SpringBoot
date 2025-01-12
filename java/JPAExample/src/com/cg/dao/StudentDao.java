package com.cg.dao;

import java.util.List;

import com.cg.bean.Student;
import com.cg.config.JPAConfig;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Query;

public class StudentDao implements IStudentDao{
	EntityManager em = JPAConfig.getEntityManager();
	EntityTransaction tx = em.getTransaction();
	@Override
	public void createStudent(Student o) {
		tx.begin();
		Student s = getStudent(o.getSid());
		if(s == null) {
			em.persist(o);
		}
		tx.commit();
		em.clear();
	}

	@Override
	public Student getStudent(int sid) {
		Student s = em.find(Student.class, sid);
		
		return s;
		
	}

	@Override
	public List<Student> getAll() {
		Query q = em.createQuery("from Student s");
		List<Student> li = q.getResultList();
		
		return li;
	}

	@Override
	public void deleteStudent(int sid) {
		tx.begin();
//		Student o = em.find(Student.class, sid);
		Student o = getStudent(sid);
		if(o != null) {
			em.remove(o);
		}
		tx.commit();
		em.clear();
	}

	@Override
	public void updateStudent(Student o) {
		tx.begin();
		Student s = em.find(Student.class, o.getSid());
		if(s !=null) {
			s.setName(o.getName());
			s.setDob(o.getDob());
			s.setMarks(o.getMarks());
			tx.commit();
		}
		else {
			em.persist(o);
		}
		
	}

}
