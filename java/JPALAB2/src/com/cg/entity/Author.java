package com.cg.entity;

import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "author")
public class Author {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "author_book", joinColumns = @JoinColumn(name = "author"), inverseJoinColumns = @JoinColumn(name = "book"))
	private Set<Book> books;
	
	
	public Author() {
		
	}


	public Author(String name) {
		super();
		this.name = name;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Set<Book> getBooks() {
		return books;
	}


	public void setBooks(Set<Book> books) {
		this.books = books;
	}


	@Override
	public String toString() {
		return "Author [id=" + id + ", name=" + name + "]";
	}


	
	
	
	
}
