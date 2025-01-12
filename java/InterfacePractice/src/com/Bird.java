package com;

public class Bird extends Animal implements FlightEnabled, Trackable {

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("Flaps Wings");
	}

	@Override
	public void takeOff() {
		// TODO Auto-generated method stub
		System.out.println(getClass().getSimpleName() + " is taking of");
		
	}

	@Override
	public void land() {
		// TODO Auto-generated method stub
		System.out.println(getClass().getSimpleName() + " is landing");
		
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println(getClass().getSimpleName() + " is flying");
		
	}

	@Override
	public void track() {
		// TODO Auto-generated method stub
		System.out.println(getClass().getSimpleName() + "'s coordinates recorded");
		
	}

}
