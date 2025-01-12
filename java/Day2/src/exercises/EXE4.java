package exercises;
import java.util.*;
public class EXE4 {
	
	public static double avg(int n) {
		int sum = 0;
		double aveg;
		for(int i = 0; i<= n; i++) {
			sum += i;
		}
		aveg = sum / n;
		return aveg;
	}
	
	public static void main(String[] args) {
		System.out.println("Enter the n numbers = ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double aveg = avg(n);
		System.out.println("The average of n numbers is = " + aveg);
		sc.close();
	}
}
