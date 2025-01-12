package com;

public class Account implements Runnable {
	private static double accBalance = 15000;

//	public synchronized void withdraw(String name, double amt) {
//		synchronized (this) {
//			if (amt < accBalance) {
//				System.out.println(name + " is going to withdraw");
//				accBalance -= amt;
//				System.out.println("Available Balance for " + name + " is: " + accBalance);
//			} else {
//				System.out.println(name + "does not have enough balance");
//			}
//		}
//	}
	
	
	public static void withdraw(String name, double amt) {
		synchronized (Account.class) {
			if (amt < accBalance) {
				System.out.println(name + " is going to withdraw");
				accBalance -= amt;
				System.out.println("Available Balance for " + name + " is: " + accBalance);
			} else {
				System.out.println(name + " does not have enough balance");
			}
		}
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		withdraw(Thread.currentThread().getName(), 10000);
	}

}
