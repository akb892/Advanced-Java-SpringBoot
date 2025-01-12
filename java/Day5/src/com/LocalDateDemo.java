package com;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class LocalDateDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Dob: ");
		String dob = sc.next();
		
		
		
		LocalDate now = LocalDate.now();
		System.out.println(now);
		DateTimeFormatter dt = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		LocalDate dob1 = LocalDate.parse(dob, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
		
		Period p = Period.between(dob1, now);
		System.out.println("year = " + p.getYears());
		System.out.println("Months =  " + p.getMonths());
		System.out.println("Days = " + p.getDays());
		
//		long year = dob1.until(now, ChronoUnit.YEARS);
//		long Months = dob1.until(now, ChronoUnit.MONTHS);
//		long days = dob1.until(now, ChronoUnit.DAYS);
		
		long year = ChronoUnit.YEARS.between(dob1, now);
		System.out.println(year);
		
//		System.out.println(now);
//		System.out.println(dob1);
//		
//		System.out.println("year diff: " + year);
//		System.out.println("Month diff: " + Months);
//		System.out.println("Days diff: " + days);
		sc.close();
		
	}
}
