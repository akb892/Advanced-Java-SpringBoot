package com;

public class Calculator extends Thread {
	int total;
	public synchronized void run() {
		for(int i = 0; i< 100; i++) {
			total += i;
		}
		notify();
	}
}
