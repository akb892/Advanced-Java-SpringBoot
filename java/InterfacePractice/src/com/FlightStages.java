package com;

public enum FlightStages implements Trackable {

	Grounded, Launch, Cruise, Data_Collection;

	@Override
	public void track() {
		// TODO Auto-generated method stub
		if (this != Grounded) {
			System.out.println("Monitoring " + this);
		}
	}

	public FlightStages getNextStages() {
		FlightStages[] allStages = values();
		return allStages[(ordinal() + 1) % allStages.length];
	}

}
