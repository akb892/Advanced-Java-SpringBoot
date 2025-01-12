package capg.exercise;

import java.util.Scanner;

public class EXE2 {

	public static String getImage(String s) {
		StringBuilder sc = new StringBuilder(s);
		sc.reverse();
		return sc.toString();
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String s = sc.next();
		String s1 = getImage(s);
		
		System.out.println(s + "|" + s1);
	}
}
