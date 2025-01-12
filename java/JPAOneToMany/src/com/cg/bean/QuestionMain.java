package com.cg.bean;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class QuestionMain {
	
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		
		Question q = new Question("What is ORM", "Saurabh", 5);
		Set<Answer> ans = new HashSet<>();
		ans.add(new Answer("Object Relational Mapping", "Shipra"));
		ans.add(new Answer("Orm is a abstract layer of Persistence Unit", "Aryan"));
		q.setAnswers(ans);
		
		em.persist(q);
		tx.commit();
		System.out.println("Question Saved...");
	}
}
