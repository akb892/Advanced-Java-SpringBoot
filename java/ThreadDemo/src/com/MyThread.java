package com;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.Locale;

public class MyThread implements Runnable {// extends Thread {
	public void run() {
		while(true) {
//			System.out.println(Thread.currentThread().getName() + " is Running");
			//System.out.println(LocalDateTime.now().getHour() + " " +  LocalDateTime.now().getMinute() + " " + LocalDateTime.now().getSecond());
			System.out.println(Thread.currentThread().getName());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("Sleep Interrupted");
			}
		}
	}

}
