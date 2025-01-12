package capg.exercise;

import java.util.Scanner;

public class EXE4 {
	public static int modifyNumber(int number1) {
		String s = Integer.toString(number1);
		StringBuilder s1 = new StringBuilder();
		
		for(int i = 0; i < s.length() - 1; i++) {
			int a = s.charAt(i);
			int b = s.charAt(i+1);
			int diff = Math.abs(a-b);
			s1.append(diff);
		}
		
		s1.append(s.charAt(s.length() - 1));
		
		return Integer.parseInt(s1.toString());
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		n = modifyNumber(n);
		System.out.println("The number is: " + n);
		sc.close();
	}
	
}
