package com.cg.eis.service;

import java.util.ArrayList;
import java.util.List;

import com.cg.eis.bean.Book;

public class Customer {
	
	String customerName;
	String address;
	
	
	public Customer(String customerName, String address) {
		super();
		this.customerName = customerName;
		this.address = address;
	}

	List<Book> borrowed;

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	public List<Book> borrowed1(int bookIsbnNo) {
		borrowed = new ArrayList<>();
		
		for(Book b : borrowed) {
			if(b.getBookIsbnNo() == bookIsbnNo) {
				borrowed.add(b);
			}
		}
		
		return borrowed;
	}
	
}
