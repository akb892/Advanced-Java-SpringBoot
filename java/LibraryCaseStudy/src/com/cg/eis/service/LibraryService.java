package com.cg.eis.service;

import java.util.ArrayList;
import java.util.List;

import com.cg.eis.bean.Book;

public class LibraryService implements ILibraryService{
	
	String libraryName;
	String address;
	List<Book> books;
	
	
	
	public LibraryService(String libraryName, String address) {
		super();
		this.libraryName = libraryName;
		this.address = address;
		books = new ArrayList<>();
		
		books.add(new Book(102,"Stephen King","Viking Press",1500));
		books.add(new Book(103,"Akira Toriyama","Shueisha",2800));
		books.add(new Book(104,"J. R. R. Tolkien","George Allen & Unwin",900));
		books.add(new Book(105,"J.K Rowling","Bloomsbury Publishing",1300));
	}
	@Override
	public List<Book> getBooks() {
		return books;
		
	}
	@Override
	public void addBook(Book b) {
		books.add(b);
	}
	@Override
	public void removeBook(int bookIsbnNo) {
		for(Book b : books) {
			if(b.getBookIsbnNo() == bookIsbnNo) {
				books.remove(b);
			}
		}
	}
	@Override
	public Book findMaxPrice(String publisher) {
		float maxPrice = 0;
		for(Book b: books) {
			if(b.getPublisher().equalsIgnoreCase(publisher)) {
				if(b.getPrice() > maxPrice) {
					maxPrice = b.getPrice();
				}
			}
		}
		
		for(Book b: books) {
			if(b.getPrice() == maxPrice) {
				return b;
			}
		}
		
		return null;
	}
	
	
}
