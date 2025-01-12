package com.cg.bean;

public class Product implements Comparable<Product>{

	String name;

	public Product(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "Product [name=" + name + "]";
	}

	@Override
	public int compareTo(Product o) {
		// TODO Auto-generated method stub
		return this.name.compareTo(o.name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
