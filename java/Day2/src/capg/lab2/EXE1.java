package capg.lab2;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class EXE1 {
	
	public static int getSecondSmallest(int[] arr) {
		Arrays.sort(arr);
		return arr[1];
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter the length of the array");
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i =0 ; i< n; i++) {
			arr[i] = sc.nextInt();
		}
		for(int x: arr) {
			System.out.println("The array given = " + x);
		}
		int secSmall = getSecondSmallest(arr);
		System.out.println("The second smallest element is = " + secSmall);
		sc.close();
	}

}


