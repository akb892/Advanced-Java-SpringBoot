package com.cg.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.cg.bean.Product;
import com.cg.sort.SortByProductName;

public class ListDemo1 {
	public static void main(String[] args) {
		/*
		 * List<String> li1 = new ArrayList<>();
		 * 
		 * li.add("Avinash"); li.add("")
		 */
		
		List<Product> li = new ArrayList<>();
		li.add(new Product("Apple"));
		li.add(new Product("Iphone"));
		li.add(new Product("Book"));
		li.add(new Product("One Plus"));
		
		System.out.println(li);
		Collections.sort(li);
		System.out.println(li);
		
		Collections.sort(li, new SortByProductName());
		System.out.println(li);
	}
}
