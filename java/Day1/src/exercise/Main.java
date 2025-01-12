package exercise;
import java.util.*;

public class Main {
	
	
	public static int sumOfCubesOfDigits(int n) {
		int sum = 0;
		int digit = 0;
		while(n > 0) {
			digit = n % 10;
			sum = sum + (int)Math.pow(digit, 3);
			n = n/10;
		}
		return sum;
		
	}

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number = ");
		int n = sc.nextInt();
		int sum = sumOfCubesOfDigits(n);
		System.out.println("The sum of cubes of digits of the number = " + sum);
		sc.close();
		
	}
	
	
}
