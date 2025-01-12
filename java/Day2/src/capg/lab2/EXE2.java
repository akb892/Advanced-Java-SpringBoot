package capg.lab2;

import java.util.Arrays;
import java.util.Scanner;

public class EXE2 {
	
	public static String[] sortStrings(String[] arr) {
		int n = arr.length;
		String res[] = new String[n];
		String res2[] = new String[n];
		for(int i = 0; i<n; i++) {
			res[i] = arr[i].toLowerCase();
			
		}
		Arrays.sort(res);
		System.out.println(Arrays.toString(arr));
		int m;
		
		if(n%2==0) {
			m=n-1;
			n= (n/2) -1;
		}
		else {
			m = n-1;
			n = (n/2);
		}
		for(int i = 0; i <=n; i++) {
			res2[i] = res[i].toUpperCase();
		}
		for(int i = n+1; i<=m; i++) {
			res2[i] = res[i].toLowerCase();
		}
		
		return res2;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of the Array = ");
		int n = sc.nextInt();
		String arr[] = new String[n];
		
		for(int i = 0; i< n; i++) {
			arr[i] = sc.next();
		}
		arr = sortStrings(arr);
		for(String x: arr) {
			System.out.println(x);
		}
		sc.close();
	}
}
