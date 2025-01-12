package com;

public class CalculatorMain {
	public static void main(String[] args) throws InterruptedException {
		Calculator cal = new Calculator();
		cal.start();
		synchronized(cal) {
			System.out.println("Waiting for Calculation");
			cal.wait();
			
		}
		System.out.println("Total= " + cal.total);
	}
}
