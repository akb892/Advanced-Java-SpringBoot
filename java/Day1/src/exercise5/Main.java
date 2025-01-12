package exercise5;
import java.util.*;

public class Main {
	public static int calculateSum(int n) {
		int sum = 0;
		for(int i = 1; i <= n; i++) {
			if(i%3 == 0 || i%5 == 0) {
				sum += i;
			}
		}
		return sum;
	}
	
	public static void main(String[] args) {
		System.out.println("Enter the number of natural numbers= ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = calculateSum(n);
		System.out.println("The sum of the numbers are = " + sum);
		sc.close();
	}
}
