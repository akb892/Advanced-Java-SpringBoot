package capg.exercise;

import java.util.Scanner;

public class EXE3 {
	public static String alterString(String s) {
		char s1[] = s.toCharArray();
		
		for(int i = 0; i< s1.length; i++) {
			if(Character.isAlphabetic(s1[i])) {
				char c = Character.toUpperCase(s1[i]);
				char a = s1[i];
				if(!(c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U')) {
					a = (char)(a+1);
					s1[i] = a;
				}
				else if(c == 'Z') {
					a = (char)(a - 25);
					s1[i] = a;
				}
				
			}
		}
		String s2 = new String(s1);
		return s2;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String s = sc.next();
		s = alterString(s);
		System.out.println(s);
		sc.close();
	}
}
