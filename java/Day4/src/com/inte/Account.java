package com.inte;

public abstract class Account {
	double interestRate;
	double amount;
	
	
	public Account(double amount) {
		super();
		this.amount = amount;
		this.interestRate = calculateInterest();
	}


	public abstract double calculateInterest()
}

