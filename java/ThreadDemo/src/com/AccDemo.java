package com;

public class AccDemo {

	public static void main(String[] args) {
		/*
		 * Account acc = new Account();
		 * 
		 * Thread t1 = new Thread(acc, "Aryan"); Thread t2 = new Thread(acc, "Aman");
		 * Thread t3 = new Thread(acc, "Ankan");
		 * 
		 * t1.start(); t2.start(); t3.start();
		 */

		Account acc = new Account();
		Account acc1 = new Account();
		Account acc2 = new Account();

		Thread t1 = new Thread(acc, "Aryan");
		Thread t2 = new Thread(acc1, "Aman");
		Thread t3 = new Thread(acc2, "Ankan");

		t1.start();
		t2.start();
		t3.start();
	}

}
