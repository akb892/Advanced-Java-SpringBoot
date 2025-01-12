package com;

public class StringBufferDemo {
	public static void main(String[] args) {
		String str ="Hello";
		String str1 = "Hello";
		StringBuffer sc = new StringBuffer(str);
		sc.append(" Java");
		System.out.println(sc);
		sc.insert(6, "Core ").delete(0,3).reverse();
		System.out.println(sc);
		
		System.out.println(str.compareTo(str1));
	}
}
