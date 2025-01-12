package com.cg.sort;

import java.util.Comparator;

import com.cg.bean.Product;

public class SortByProductName implements Comparator<Product> {

	@Override
	public int compare(Product o1, Product o2) {
		return o1.getName().compareTo(o2.getName());
	}

}
