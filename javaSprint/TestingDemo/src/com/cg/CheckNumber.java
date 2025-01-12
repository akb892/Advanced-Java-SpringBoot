package com.cg;

public class CheckNumber {
	
	public String checkEvenOrOdd(int no) {
		
		if(no<0) {
			return "Not Valid";
		}
		else if(no % 2==0) {
			return "Even";
		}
		else {
			return "Odd";
		}
		
		
	}
	
	
	public boolean checkPrimeOrNot(int no) {
		for(int i=2;i < no/2;i++) {
			if(no%i == 0) {
				return false;
			}
		}
		return true;
	}
}
