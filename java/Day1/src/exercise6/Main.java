package exercise6;
import java.util.*;

public class Main {
	public static int calculateDifference(int n) {
		int sum1 = 0, sum2 = 0, diff = 0;
		for(int i = 1; i <= n; i++) {
			sum1 += Math.pow(i, 2);
		}
		for(int i = 1; i <= n; i++) {
			sum2 += i;
		}
		diff = sum1 - (int)Math.pow(sum2,2);
		return diff;
	}
	
	public static void main(String[] args) {
		System.out.println("Enter the first n natural numbers");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int diff = calculateDifference(n);
		System.out.println("The Final difference is = " + diff);
		sc.close();
	}
}
