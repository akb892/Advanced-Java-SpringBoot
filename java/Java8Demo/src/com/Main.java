package com;

public class Main {
	public static void main(String[] args) {
//		ICalculator cal = (a,b)-> a+b;
		
		ICalculator cal = new MyCalculator()::sum;
		
		System.out.println(cal.calculate(20, 12));
	}
}
