package com;

import java.util.Arrays;

public class SelectionSort {
	
	public static void sortArray(int[] arr) {
		
		for(int i =0; i<arr.length-1 ;i++) {
			for(int j = i+1; j< arr.length;j++) {
				if(arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
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
