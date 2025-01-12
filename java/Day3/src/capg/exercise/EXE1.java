package capg.exercise;

import java.util.Scanner;
import java.util.StringTokenizer;

public class EXE1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String s = sc.nextLine();
		
		StringTokenizer tokenizer = new StringTokenizer(s);
		
		while(tokenizer.hasMoreTokens()) {
			System.out.println(tokenizer.nextToken());
		}
	}
}
