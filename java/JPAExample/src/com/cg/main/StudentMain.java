package com.cg.main;

import java.time.LocalDate;

import com.cg.bean.Student;
import com.cg.service.IStudentService;
import com.cg.service.StudentServiceImp;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class StudentMain {
	public static void main(String[] args) {
//		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA-PU");
//		EntityManager em = emf.createEntityManager();
//		EntityTransaction tx = em.getTransaction();
//		tx.begin();
//		Student s = new Student(101,"Aryan", LocalDate.of(2002, 06, 06), 90);
//		//Student s1 = new Student("Subham", LocalDate.of(2002, 06, 06), 90);
//		//Student s2 = new Student("Frankline", LocalDate.of(2002, 06, 06), 90);
//		em.persist(s);
//		//em.persist(s1);
//		//em.persist(s2);
//		tx.commit();
//		System.out.println("Student Created....");
//		em.close();
		IStudentService serv = new StudentServiceImp();
		
		
//		System.out.println(serv.saveStudent(new Student(101,"Aryan", LocalDate.of(2002, 06, 06), 98)));
//		System.out.println(serv.saveStudent(new Student(102,"Aman", LocalDate.of(2002, 06, 06), 98)));
//		System.out.println(serv.saveStudent(new Student(103,"Frankline", LocalDate.of(2002, 06, 06), 98)));
//		System.out.println(serv.saveStudent(new Student(104,"Parushi", LocalDate.of(2002, 06, 06), 98)));
//		System.out.println(serv.saveStudent(new Student(105,"Dipti", LocalDate.of(2002, 06, 06), 98)));
		
//		Student s = serv.findStudent(103);
//		System.out.println(s);
//		System.out.println(serv.findStudent(109));
		
//		serv.deleteStudent(101);
		
		serv.updateStudent(new Student(102, "Aman", LocalDate.of(2002, 12, 12),98));
//		
		serv.getAllStudent().forEach(System.out::println);
		
		
	}
}
