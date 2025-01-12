package exercises;
import java.util.*;

public class EXE10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the year = ");
		int year = sc.nextInt();
		System.out.println("Enter the month = ");
		String month = sc.next();
		
		switch(month) {
		case "January": {
			System.out.println("The number of days is = 31");
			break;
		}
		case "February": {
			if(year % 4 == 0 && year % 100 == 0 && year % 400 == 0) {
				System.out.println("The number of days is = 29");
				break;
			}
			else if(year % 4 == 0 && year % 100 != 0) {
				System.out.println("The number of days is = 29");
				break;
			}
			else if(year % 4 != 0){
				System.out.println("The number of days is = 28");
				break;
			}
		}
		case "March" : {
			System.out.println("The number of days is = 31");
			break;
		}
		case "April" : {
			System.out.println("The number of days is = 30");
			break;
		}
		case "May" : {
			System.out.println("The number of days is = 31");
			break;
		}
		case "June" : {
			System.out.println("The number of days is = 30");
			break;
		}
		case "July" : {
			System.out.println("The number of days is = 31");
			break;
		}
		case "August": {
			System.out.println("The number of days is = 31");
			break;
		}
		case "September" : {
			System.out.println("The number of days is = 30");
			break;
		}
		case "October" : {
			System.out.println("The number of days is = 31");
			break;
		}
		case "November" : {
			System.out.println("The number of days is = 30");
			break;
		}
		case "December" : {
			System.out.println("The number of days is = 31");
			break;
		}
		default : System.out.println("Month name invalid");
		}
		sc.close();

	}
}
