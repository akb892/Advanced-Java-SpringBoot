package com.cg.main;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class MapDemo {
	public static void main(String[] args) {
		Map<String, String> users = new HashMap<String, String>();
		
		users.put("Aryan", "abc123");
		users.put("Aman", "xyz123");
		users.put("Ankan", "abc12");
		
		/*
		 * System.out.println(users);
		 * 
		 * Scanner sc = new Scanner(System.in); System.out.println("Enter UserName: ");
		 * String name = sc.next();
		 * 
		 * System.out.println("Enter Password: "); String pass = sc.next();
		 * if(!(users.containsKey(name))) { users.put(name, pass); } else {
		 * System.out.println("User already available"); }
		 * 
		 * System.out.println(users);
		 */
		
		Set<String> usr = users.keySet();
		System.out.println(usr);
		
		Collection<String> val = users.values();
		System.out.println(val);
		System.out.println("Password of Aman= " + users.get("Aman"));
	}
}

