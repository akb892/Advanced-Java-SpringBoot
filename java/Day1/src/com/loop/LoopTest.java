package com.loop;

public class LoopTest {
	
	int fib(int n) {
		if(n<=1) {
			return n;
		}
		return fib(n-1) + fib(n-2);
	}
	
	
	public static void main(String[] args) {
		
		
		/*int a = 0, b = 1;
		System.out.println(a);
		while(b<50) {
			System.out.println(b);
			b+=a;
			a=b-a;*/
//		}
		
		LoopTest obj = new LoopTest();
		int n = 50;
		for (int i = 0; i <= n; i++) {
			if(obj.fib(i) > 50) {
				break;
			}
			System.out.println(obj.fib(i));
		}
	}

}

