package com.exe;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OperationString {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		List<String> li  = new ArrayList<String>(); 
		
		int n = 0;
		
		
		while(n != 5) {
			
			System.out.println("1. Insert" );
			System.out.println("2. Search");
			System.out.println("3. Delete");
			System.out.println("4. Display");
			System.out.println("5. Exit");
			System.out.println("Enter your Choice: ");
			n = sc.nextInt();
			switch(n) {
			case 1:{
				System.out.println("Enter the item to be inserted: ");
				li.add(sc.next());
				System.out.println("Inserted Successfully");
				break;
			}
			case 2: {
				System.out.println("Enter the item to search: ");
				String item = sc.next();
				int a= 0;
				for(String s : li) {
					if(s .equals(item)) {
						System.out.println("Item found in the list");
						a++;
						break;
					}
				}
				if(a==0) {
					System.out.println("Item not found in the list");
				}
				
				break;
			}
			case 3: {
				System.out.println("Enter the item to be deleted");
				String item = sc.next();
				String s1 = null;
				for(String s: li) {
					if(s.equals(item)) {
						s1 = s;
						break;
					}
				}
				if(s1 != null) {
					li.remove(s1);
					System.out.println("Item Removed");
				}
				else {
					System.out.println("Item not found!");
				}
				break;
			}
			case 4: {
				System.out.println("The items in the list are: ");
				for(String s : li) {
					System.out.println(s);
				}
				break;
			}
			case 5: {
				n = 5;
				break;
			}
			default : System.out.println("Invalid option entered!!!");
			}
		}
		
		sc.close();
	}
}
