package com.cg.entity;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class Main {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		/*
		 * tx.begin();
		 * 
		 * DL obj = new DL("ab10xy24", LocalDate.of(2020,06,20), LocalDate.of(2040, 06,
		 * 06)); List<String> li = List.of("LMV", "HMV", "NT", "MCWG");
		 * 
		 * obj.setvType(li); em.persist(obj);
		 * 
		 * 
		 * tx.commit(); System.out.println("Created....");
		 */
//		tx.begin();
//		Person p = new Person("Ankan", LocalDate.of(2001,05,26));
//		DL obj = em.find(DL.class, "ab10xy24");
//		p.setDl(obj);
//		em.persist(p);
//		tx.commit();
//		System.out.println("Person Created....");
		
		
//		tx.begin();
//		Person p = new Person("Aryan", LocalDate.of(2002, 06, 06));
//		DL obj = new DL(LocalDate.of(2020,06,20),LocalDate.of(2040,06,20), "NoidaRTO", p);
//		List<String> li = List.of("LMV", "HMV", "NT", "MCWG");
//		obj.setvType(li);
//		p.setDl(obj);
//		
//		em.persist(p);
//		tx.commit();
//		System.out.println("Person created....");
		
		
		Person obj = em.find(Person.class, 1);
		System.out.println(obj);
//		em.detach(obj);
		System.out.println("========DL Detail========");
		System.out.println(obj.getDl());
		
		
		
		
	}
}
