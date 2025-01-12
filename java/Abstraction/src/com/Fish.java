package com;

public class Fish extends Animal {

	public Fish(String type, String size, double weight) {
		super(type, size, weight);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void move(String speed) {
		// TODO Auto-generated method stub
		if(speed.equals("slow")) {
			System.out.println(getExplicitType() + " lazily swimming");
		}
		
		else {
			System.out.println(getExplicitType() + " dating frantically");
		}
		
	}

	@Override
	public void makeNoise() {
		// TODO Auto-generated method stub
		
		if(type == "GoldFish") {
			System.out.print("Swish! ");
		}
		else {
			System.out.print("Splash! ");
		}
		
	}

}
