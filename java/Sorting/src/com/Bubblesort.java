package com;

import java.util.Arrays;

public class Bubblesort {
	
	public static void sortArray(int[] arr) {
		for(int i =0; i< arr.length; i++) {
			for(int j = 0; j < arr.length-1; j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					
				}
				System.out.println(Arrays.toString(arr));
			}
		}
//		System.out.println(Arrays.toString(arr));
	}

	public static void main(String[] args) {
		int arr[] = {5,9,6,2,12};
		
		sortArray(arr);

	}

}
