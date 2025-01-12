package map.exer;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Exe1 {
	
	public static void main(String[] args) {
		Map<String, String> m = new TreeMap<String, String>();
		
		
		m.put("Aryan", "abc1222");
		m.put("Parushi", "Parr123");
		m.put("Dipti", "Dip123");
		Scanner sc = new Scanner(System.in);
		int a = 0;
		while(a!=4) {
			System.out.println("1. Add new map pair");
			System.out.println("2. Login check");
			System.out.println("3. Print all users");
			System.out.println("4. EXIT");
			System.out.println("Enter the method you want to go to: ");
			
			a = sc.nextInt();
			
			switch(a) {
			case 1: {
				System.out.println("Enter the value to be entered: ");
				String uname = sc.next();
				System.out.println("Enter the password: ");
				String pass = sc.next();
				if(!(m.containsKey(uname))) {
					m.put(uname, pass);
					System.out.println("User added successfully");
				}
				else {
					System.out.println("User already present");
				}
				break;
			}
			case 2: {
				System.out.println("Enter the username to login: ");
				String uname = sc.next();
				System.out.println("Enter the password: ");
				String pass = sc.next();
				if(m.keySet().contains(uname) && m.values().contains(pass)) {
					System.out.println("Login Successfull");
				}
				else {
					System.out.println("User id or password invalid!!");
				}
				break;
			}
			case 3: {
				System.out.println("All the username and password will be: ");
				for(String e : m.keySet()) {
					System.out.println(e + " " + m.get(e));
				}
				break;
			}
			case 4: {
				a = 4;
				break;
			}
			
			default: System.out.println("Enter a valid method to do");
			}
		}
		
		sc.close();
	}

}
