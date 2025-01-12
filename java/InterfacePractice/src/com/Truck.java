package com;

public class Truck implements Trackable {
	@Override
	public void track() {
		// TODO Auto-generated method stub
		System.out.println(getClass().getSimpleName() + "'s coordinates recorded");
		
	}
}
