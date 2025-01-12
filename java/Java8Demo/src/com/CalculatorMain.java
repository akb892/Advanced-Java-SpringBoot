package com;

public class CalculatorMain {
	public static void main(String[] args) {
		/*
		 * // ICalculator cal = new Sum(); // System.out.println(cal.calculate(10, 5));
		 * // cal = new Sub(); // System.out.println(cal.calculate(10, 5));
		 */		
		
		/*
		 * ICalculator cal = new ICalculator() {
		 * 
		 * @Override public int calculate(int a, int b) { // TODO Auto-generated method
		 * stub return a+b; }
		 * 
		 * }; System.out.println(cal.calculate(10, 8));
		 * 
		 * cal = new ICalculator() {
		 * 
		 * @Override public int calculate(int a, int b) { // TODO Auto-generated method
		 * stub return a-b; }
		 * 
		 * }; System.out.println(cal.calculate(10, 8));
		 */
		
		
		ICalculator cal = (x,y) ->{
			System.out.println("Adding two numbers");
			return x+y;
		};
		System.out.println(cal.calculate(10, 7));
		cal = (x,y)->x-y;
		System.out.println(cal.calculate(10, 7));
	}
}
