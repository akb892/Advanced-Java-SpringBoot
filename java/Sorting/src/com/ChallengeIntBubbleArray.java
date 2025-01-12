package com;

import java.util.Arrays;
import java.util.Scanner;

public class ChallengeIntBubbleArray {
	
	public static void sortArray(int[] arr) {
		
		for(int i = 0 ; i<arr.length; i++) {
			for(int j = 0; j<arr.length-1;j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
		System.out.println("The sorted array: " + Arrays.toString(arr));
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of the array");
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		System.out.println("Enter the element of the array :");
		
		for(int i = 0; i < n; i++) {
			
			arr[i] = sc.nextInt();
		}
		System.out.println("The given array: " + Arrays.toString(arr));
		
		sortArray(arr);
		
		sc.close();
	}
}
