package com.cg;

public class ArrayDemo {
	public static void main(String[] args) {
//		int[]  arr = new int[5];
		
//		int arr[] = {3,5,9,45,77};
		int arr[][] = {{11,111}, {22,222,2222},{33},{44,444,4444,44444}};
		System.out.println(arr[1][0]);
		
//		for(int x: arr) {
//			System.out.println(x);
//		}
		
		for(int x[] : arr) {
			for(int j:x) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}
