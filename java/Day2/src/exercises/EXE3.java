package exercises;
import java.util.*;


public class EXE3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int flg = 1;
		System.out.println("Enter the number = ");
		int n = sc.nextInt();
		
		if(n == 0 || n == 1) {
			flg= 0;
		}
		
		for(int i = 2; i <= n/2; i++) {
			if(n % i == 0) {
				flg = 0;
				break;
			}
		}
		
		if(flg == 0) {
			System.out.println("Not a prime number");
		}
		else {
			System.out.println("It is a prime number");
		}
		sc.close();
	}
}
