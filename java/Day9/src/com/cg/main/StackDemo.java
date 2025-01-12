package com.cg.main;

import java.util.Stack;

public class StackDemo {
	public static void main(String[] args) {
		Stack<String> s = new Stack<String>();
		s.add("Ankan");
		s.add("Prachi");
		s.push("Amitt");
		s.push("Raj");
		s.push("Frankline");
		
		/*
		 * System.out.println(s.size()); System.out.println(s.pop());
		 * System.out.println(s.peek()); System.out.println(s.size());
		 */
		
		
//		System.out.println(s.search("Raj"));
		
		for(String str: s) {
			System.out.println(str);
		}
		
		System.out.println(s.get(3));
	}
}
