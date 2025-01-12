package com;

import java.util.Scanner;

public class StringDemo {
	public static void main(String[] args) {
//		String str = "Hello";
//		str.concat(" Java");
//		System.out.println(str);
//		
//		String str1 = "Hello";
//		System.out.println(str.equals(str1));
//		System.out.println(str.substring(2));
		
//		String str = "Aman,Frankline,Asijit,Ankan,Suvam";
//		
//		String names[] = str.split(",");
//		
//		for(String n: names) {
//			System.out.println(n);
//			System.out.println();
//		}
//		
//		String str1 = "Aman12Frankline345Asijit2Ankan98876Suvam";
//		String names1[] = str1.split("\\d+");
//		
//		for(String x: names1) {
//			System.out.println(x);
//			System.out.println();
//		}
//		
//		String str2 = "Aman5@#Frankline*(Asijit&$8%Ankan987Shuvam";
//		String names2[] = str2.split("[\\d\\W+]+");
//		String names3[] = str2.split("[0-9]+//W+");
//		
//		for(String y: names2) {
//			System.out.println(y);
//		}
//		System.out.println();
//		for(String z: names3) {
//			System.out.println(z);
//		}
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Mobile No.");
		String ph = sc.next();
		if(ph.matches("\\d{10}")) {
			System.out.println("Your no is = " + ph);
		}
		else {
			System.out.println("Invalid Phone");
		}
		sc.close();
	}
}
