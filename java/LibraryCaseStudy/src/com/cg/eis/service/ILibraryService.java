package com.cg.eis.service;

import java.util.List;

import com.cg.eis.bean.Book;

public interface ILibraryService {
	
	List<Book> getBooks();
	
	void addBook(Book b);
	
	void removeBook(int bookIsbnNo);
	
	Book findMaxPrice(String publisher);
}
