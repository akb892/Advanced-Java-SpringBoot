package capg.lab2;

import java.util.Arrays;
import java.util.Scanner;

public class EXE3 {

	public static int[] getSorted(int arr[]) {
		int n = arr.length,a=0;
		int res[] = new int[n];
		for(int i = 0; i<n; i++) {
			while(arr[i] > 0) {
				a = a * 10 + arr[i] % 10;
				arr[i] /=  10;
			}
			res[i] = a;
			a = 0;
		}
		Arrays.sort(res);
		
		return res;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Set the length of the Array = ");
		n = sc.nextInt();
		int arr[] = new int[n];
		for(int i = 0; i< n; i++) {
			System.out.println("Enter the " + i + " element in the array");
			arr[i] = sc.nextInt();
		}
		
		int res[] = new int[n];
		res = getSorted(arr);
		
		for(int x: res) {
			System.out.println("The array is = " + x);
		}
	}
}
