package com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		Map<ActionEnum, Integer> m = new HashMap<>();
		
		m.put(ActionEnum.feature1Button, 7);
		m.put(ActionEnum.feature2Button, 5);
		m.put(ActionEnum.feature3Button, 8);
		m.put(ActionEnum.appliedFilter, 1);
		m.put(ActionEnum.proceedButton, 10);
		
		
		int max = Collections.max(m.values());
		List<ActionEnum> li = new ArrayList<>();
		for(Map.Entry<ActionEnum, Integer> m1 : m.entrySet()) {
			if(m1.getValue() == max) {
				li.add(m1.getKey());
			}
		}
		
//		System.out.println(Collections.max(m.values()));
		
		Collections.sort(li);
		
//		li.sort((a1,a2)-> a1.name().compareTo(a2.name()));
		
		System.out.println(li);
		
		
		List<ActionEnum> li2 = new ArrayList<>(m.keySet());
		
		Collections.sort(li2);
		System.out.println(li2);
	}
}