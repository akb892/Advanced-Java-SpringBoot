package com;

public class Netflix {
	public void setAge(int age) throws InvalidAgeException {
//		if(age >= 18) {
//			System.out.println("You are valid for this app");
//		}
//		else {
//			System.out.println("Your age is not valid");
//		}
		if(age<18) {
			throw new InvalidAgeException("Your age is not valid");
		}
	}
	
	public void viewContent() {
		System.out.println("Zzzzzzzzz");
	}
}
