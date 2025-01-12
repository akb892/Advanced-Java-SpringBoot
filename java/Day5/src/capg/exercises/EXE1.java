package capg.exercises;

import java.util.Scanner;

public class EXE1 {

	public static void ageValidation(int age) throws AgeCheck {
		
		if(age < 15) {
			throw new AgeCheck("The age is not valid");
		}
		else {
			System.out.println("The age is: " + age);
		}
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		
		try {
			ageValidation(age);
		}
		catch (AgeCheck e){
			System.out.println(e.getMessage());
		}
		finally {
			sc.close();
		}
	}
}


