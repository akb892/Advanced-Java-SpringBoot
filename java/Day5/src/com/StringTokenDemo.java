package com;

import java.util.Scanner;
import java.util.StringTokenizer;

public class StringTokenDemo {
	
	public static void main(String[] args) {
		String str = "Swati true 12 Shridhi false Shweta 34 true Amit true Raghav 56 Saurabh";
//		StringTokenizer obj = new StringTokenizer(str, "");
//		
//		while(obj.hasMoreElements()) {
//			System.out.println(obj.nextElement());
//		}
		
		Scanner sc = new Scanner(str);
		while(sc.hasNext()) {
			if(sc.hasNextBoolean())
				System.out.println(sc.next());
			else
				sc.next();
		}
			
	}
	
}
