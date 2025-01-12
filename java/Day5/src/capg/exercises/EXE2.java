package capg.exercises;

import java.util.Scanner;

public class EXE2 {

	public static void fuName(String fname, String lname) throws NameCheck {
		
		if(fname == null || fname.isBlank() || lname.isBlank()|| lname == null) {
			throw new NameCheck("First name or last name is required!!!");
		}
		else {
			System.out.println("The full name is: " + fname + " " + lname);
		}
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your first name: ");
		String fname = sc.nextLine();
		System.out.println("Enter your last name: ");
		String lname = sc.nextLine();
		
		try {
			fuName(fname, lname);
		}
		catch(NameCheck w) {
			System.out.println(w.getMessage());
		}
		
		finally {
			sc.close();
		}
	}
}
