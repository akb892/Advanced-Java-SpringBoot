package com;

public class WrapperDemo {

	public void m1(Object obj) {
		System.out.println("Object");
	}
	public void m1(Integer i) {
		System.out.println("Integer");
	}
	public static void main(String[] args) {
//		Integer a = 10;
////		Integer b =new Integer("20");// not the write way to initialize.
//		Integer b = 20;
		
//		int a = 100;
//		int b = 100;
//		
//		Integer x = 128;
//		Integer y = 128;
//		
//		System.out.println(a==b);
//		System.out.println(x.equals(y));
		WrapperDemo obj = new WrapperDemo();
		obj.m1(null);
	}
}
