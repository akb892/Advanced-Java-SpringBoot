package com.cg.main;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.cg.entity.Author;
import com.cg.entity.Book;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;

public class Main {
	static EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA-PU");
	static EntityManager em = emf.createEntityManager();
	static EntityTransaction tx = em.getTransaction();
	public static void queryAllBooks() {
		tx.begin();
		Query q = em.createQuery("from Book b");
		List<Book> li = q.getResultList();
		
		System.out.println(li);
	}
	
	public static void queryBooksByAuthorName(String name) {
		Query q = em.createQuery("select a from Author a where a.name=:n");
		q.setParameter("n", name);
		List<Author> a = q.getResultList();
		for(Author e : a) {
			for(Book b : e.getBooks()) {
				System.out.println(b);
			}
		}
//		for(Book b : a.get(0).getBooks()) {
//			System.out.println(b);
//		}
	}
	
	public static void booksInPriceRange(double min, double max) {
		Query q = em.createQuery("select b from Book b where b.price >= :n and b.price <= :x");
		q.setParameter("n", min);
		q.setParameter("x", max);
		List<Book> li = q.getResultList();
		
		for(Book b: li) {
			System.out.println(b);
		}
	}
	
	public static void authorNameByBookId(int bid) {
		TypedQuery<Author> q = em.createQuery("select a from Author a inner join Book b on b.id = :n",Author.class);
		q.setParameter("n", bid);
		List<Author> li = q.getResultList();
		
		for(Author a : li) {
			System.out.println(a.getName());
		}
	}
	public static void main(String[] args) {
		
//		tx.begin();
//		
//		Author a = new Author("Frankline");
//		Set<Book> books = new HashSet<>();
//		
//		books.add(new Book("Famous Five", 5000.58));
//		books.add(new Book("Diary of the Wimpy Kid", 1000.29));
//		books.add(new Book("Fault in our stars", 3000));
//		
//		a.setBooks(books);
//		em.persist(a);
//		tx.commit();
		
//		queryAllBooks();
//		queryBooksByAuthorName("Frankline");
		
//		booksInPriceRange(1000, 4000);
		
		authorNameByBookId(105);
	}
}
