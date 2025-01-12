package com;

public class RecDemo {

//	public static int printN(int n) {

//		if(n == 0) {
//			return 0;
//		}
//		int no1 = printN(n-1);
//		//System.out.println(no1);
//		return no1;
//	}

	public static int fac(int n) {
		int total = 1;
		if (n > 0) {
			total = n * fac(n - 1);
		}
		return total;
	}

	static int n1 = 0;
	static int n2 = 1;
	
	public static void fib(int n) {

		if (n1 < n) {
			System.out.println(n1);
			n1 += n2;
			n2 = n1 - n2;
			fib(n);
		}

	}

	static int n3 = 0;
	static int n4 = 1;
	static int count = 0;
	public static void fib1(int n) {

		count++;
		if (count <= n) {
			System.out.println(n3);
			n3 += n4;
			n4 = n3 - n4;
			fib1(n);
		}

	}
	
	
	public static int pw(int x, int y) {
		
		if(x == 1 || y==0) {
			return 1;
		}
		int total1 =  x * (pw(x,y-1));
		
		return total1;
	}

	public static void main(String[] args) {
//		System.out.println(printN(10));
		// System.out.println(fac(5));
		fib(10);
		System.out.println("=========================");
		fib1(10);
		System.out.println("=========================");
		System.out.println(pw(2,5));
	}
}
