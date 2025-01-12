package com;

public class Dog extends Animal {

	public Dog(String type, String size, double weight) {
		super(type, size, weight);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void move(String speed) {
		// TODO Auto-generated method stub
		if(speed.equals("slow")) {
			System.out.println(getExplicitType() + " walking");
		}
		
		else {
			System.out.println(getExplicitType() + " running");
		}
		
	}

	@Override
	public void makeNoise() {
		// TODO Auto-generated method stub
		
		if(type == "Wolf") {
			System.out.print("Howling! ");
		}
		else {
			System.out.print("Woof! ");
		}
		
	}

}
