package com;

import java.util.Arrays;

public class InsertionSort {
	
	public static void sortArray(int arr[]) {
		for(int i = 0; i< arr.length;i++) {
			int temp = arr[i];
			for(int j = i-1; j>=0;j--) {
				if(arr[j] > temp && j >=0) {
					arr[j+1] = arr[j];
					arr[j] = temp;
				}
				else if(arr[j] < temp){
					continue;
				} 
				else {
					arr[j+1] = temp;
				}
			}
			System.out.println(Arrays.toString(arr));
		}
	}
	
	public static void main(String[] args) {
		int arr[] = {15,9,4,5,2,12,3,2};
		sortArray(arr);
	}
}
