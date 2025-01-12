package exercise7;
import java.util.*;

public class Main {
	public static boolean checkNumber(int n) {
		int flg=0,a=0,b=n;
		while(n > 0) {
			a = n%10;
			if(a<=b) {
				b = a;
				flg = 1;
			}
			else {
				flg=0;
				break;
			}
			n= n/10;
		}
		if(flg == 1) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		System.out.println("Enter the number to check: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean a = checkNumber(n);
		System.out.println(a);
		sc.close();
	}
}
