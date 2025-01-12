package com;

public class DemoThread {
	public static void main(String[] args) throws InterruptedException {
		MyThread obj = new MyThread();
		/*
		 * obj.start(); obj.start(); // obj.run();
		 * 
		 * // Thread t1 = new Thread(obj, "Mark"); // Thread t2 = new Thread(obj,
		 * "John"); // Thread t3 = new Thread(obj, "Frankline");
		 * t3.setPriority(Thread.MAX_PRIORITY); t2.setPriority(Thread.MIN_PRIORITY);
		 * t1.setPriority(6); System.out.println(t1.getPriority());
		 * System.out.println(t2.getPriority()); System.out.println(t3.getPriority());
		 * t1.start(); System.exit(0); // t1.interrupt(); //t1.join(); t2.start();
		 * t3.start(); t3.join();
		 */

//		System.out.println("T1= " + t1.isAlive());
//		System.out.println("T2= " + t2.isAlive());
//		System.out.println("T3= " + t3.isAlive());
		
		/*
		 * Thread t1 = new Thread(obj); t1.start();
		 */
		Thread t1 = new Thread(obj, "Red Light");
		Thread t2 = new Thread(obj, "Yellow Light");
		Thread t3 = new Thread(obj, "Green Light");
		t1.start();
		t2.start();
		t3.start();
		
	}
}
