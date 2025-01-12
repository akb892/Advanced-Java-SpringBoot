package com.cg.eis.pl;

import java.util.Scanner;


import com.cg.eis.service.GameService;

import com.cg.eis.service.User;
import com.cg.eis.service.authorException;

public class DigitalcomProcess {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		GameService gs = new GameService();
		User u1 = new User();
		
		while(true) {
			System.out.println(" 1) RegisterUser");
			System.out.println("2) ViewGames");
			System.out.println(" 3) searchByName");
			System.out.println("4) Login");
			System.out.println("5) Exit");
			
			int n = sc.nextInt();
			sc.nextLine();
			switch(n) {
			case 1: {
				System.out.println("Enter Userid: ");
				String userId = sc.nextLine();
				
				System.out.println("Enter password name: ");
				String password = sc.nextLine();
				
				if(u1.isAuthenticated(userId, password)) {
					System.out.println("User already Present");
				}
				else {
					u1.addUser(userId, password);
					System.out.println("User added successfully");
				}
				break;
				
			}
			case 2: {
				
				System.out.println(gs.viewAll());
				break;
			}
			
			case 3: {
				
				System.out.println("Enter the author name: ");
				String authorName = sc.nextLine();
				try {
					if(gs.authorSearch(authorName) != null) {
						System.out.println("The game name: " +gs.authorSearch(authorName));
					}
				} catch (authorException e) {
					System.out.println(e.getMessage());
				}
				break;
			}
			case 4: {
				
				System.out.println("Enter the user id: ");
				String userId = sc.nextLine();
				System.out.println("Enter the password");
				String pass = sc.nextLine();
				if(u1.isAuthenticated(userId, pass)) {
					System.out.println("Login successfull");
				}
				else {
					System.out.println("Invalid UserId and Password!!!");
				}
				break;
			}
			case 5: {
				sc.close();
				System.out.println("Exiting the system");
				return;
			}
			default: System.out.println("Invalid Choice, Please Try again");
			}
		}
	}
}
