package com;

import java.util.Arrays;

public class ChallengeStringArray {
	
	public static void sortArray(String s[]) {
		for(int i = 0; i< s.length; i++) {
			for(int j = 0; j<s.length-1; j++) {
				if(s[j].compareTo(s[j+1]) > 0 ) {
					String temp = s[j];
					s[j] = s[j+1];
					s[j+1] = temp;
				}
				System.out.println(Arrays.toString(s));
			}
		}
	}

	public static void main(String[] args) {
		String s[] = {"Car", "Apple", "Banana", "Kiwi","JackFruit", "Mango","Ice"};
		sortArray(s);
	}
}
