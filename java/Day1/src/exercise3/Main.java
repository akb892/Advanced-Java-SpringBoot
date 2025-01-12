package exercise3;
import java.util.*;

public class Main {
	
	
	public static void primeNumbers(int n) {
		int flg, i;
		for(i = 0; i <= n; i++) {
			if(i == 0 || i == 1) {
				continue;
			}
			
			flg = 1;
			
			for(int j = 2; j <= i/2; j++) {
				if(i % j == 0) {
					flg=0;
					break;
				}
			}
			if (flg==1) {
				System.out.println( i + " ");
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		primeNumbers(n);
		sc.close();
	}
}
