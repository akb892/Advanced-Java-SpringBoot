package com.cg.entity;

import jakarta.persistence.CollectionTable;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "book")
public class Book {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "my_gen")
	@SequenceGenerator(name = "my_gen", sequenceName = "my_sequence", initialValue = 101, allocationSize = 1)
	private int ISBN;
	private String title;
	private double price;
	
	
	public Book() {
		
	}

	public Book(String title, double price) {
		super();
		this.title = title;
		this.price = price;
	}

	public int getISBN() {
		return ISBN;
	}

	public void setISBN(int iSBN) {
		ISBN = iSBN;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [ISBN=" + ISBN + ", title=" + title + ", price=" + price + "]";
	}
	
	
	
}
