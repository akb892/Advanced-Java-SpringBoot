package exercise2;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your choice of traffic lights = ");
		String s = sc.next();
		String s1 = s.toUpperCase();
		switch(s1) {
		case "RED": {
			System.out.println("Stop");
			break;
		}
		case "YELLOW": {
			System.out.println("Ready");
			break;
		}
		case "GREEN" : {
			System.out.println("Go");
			break;
		}
		default: System.out.println("Not a traffic light color");
		}
		sc.close();
	}
}
