package com;

public class Main {
	public static void main(String[] args)  {
//		Calculator cal = new Calculator();
//		try {
//			cal.calculate(10,0);
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		System.out.println("End of Main");
		
		Netflix n = new Netflix();
		try {
			n.setAge(12);
			n.viewContent();
		} catch (InvalidAgeException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
		
	}
}
