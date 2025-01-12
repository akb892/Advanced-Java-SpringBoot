package com;

import java.io.File;
import java.io.IOException;

public class TestException {

	public static void main(String[] args) {
		int a= 10;
		int b = 2;
		int arr[] =  {10,4,67,45,2,50};
		try {
			System.out.println("Hello");
			System.out.println(a/b);
			System.out.println(arr[7]);
		}
		catch(ArithmeticException e) {
			System.out.println("Error1-->" + e.getMessage());
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Error2");
		}
		catch (Exception e) {
			System.out.println("Error3");
		}
		finally {
			System.out.println("End of method...");
		}
//		File f = new File("c://new.txt");
//		try {
//			f.createNewFile();
//			System.out.println("File Created...");
//		}
//		catch(Exception e) {
//			e.printStackTrace(); // to get where the exception is
//		}
	}
}
