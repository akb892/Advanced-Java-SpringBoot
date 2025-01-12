package com.cg.eis.service;


import java.util.HashMap;
import java.util.HashSet;

import java.util.Map;
import java.util.Set;

public class User implements IValidate {

	private String userId;
	private String password;
	
	
	
	
	Map<String, String> m = new HashMap<>();
	
	public void addUser(String userId, String password) {
		this.userId = userId;
		this.password=password;
		m.put(this.userId, this.password);
	}
	@Override
	public boolean isAuthenticated(String userId, String password) {
		Set<String> se = new HashSet<>(m.keySet());
		
		for(String s : se) {
			if(s.equalsIgnoreCase(userId) && m.get(s).equalsIgnoreCase(password)) {
				return true;
			}
		}
		
		return false;
	}
	
	
	
}
