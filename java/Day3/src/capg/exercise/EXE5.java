package capg.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class EXE5 {
	
	public static void countPrint(String s) {
		int lines = 0, words = 0, characters = 0;
		
		String l1[]  = s.split("\\s+");
		System.out.println(Arrays.toString(l1));
		
		for(String a : l1) {
			lines++;
			characters += a.length();
			words++;
		}
		System.out.println("Characters: " + characters);
		System.out.println("Lines : " + lines);
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String s;
		while(true) {
			s = sc.nextLine();
			if(s.equalsIgnoreCase("Stop")) {
				break;
			}
		}
		countPrint(s);
		
	}
}
