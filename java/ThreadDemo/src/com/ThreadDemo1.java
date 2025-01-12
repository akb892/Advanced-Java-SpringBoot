package com;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadDemo1 {
	public static void main(String[] args) {
		
		ExecutorService es = Executors.newFixedThreadPool(5);
		for(int i = 0; i< 50; i++) {
//			Thread t = new Thread(new MyTask());
//			t.start();
			es.execute(new MyTask());
		}
	}
}
