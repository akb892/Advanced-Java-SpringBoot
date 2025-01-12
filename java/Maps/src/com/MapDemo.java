package com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapDemo {

	public static void main(String args[]) {
		// Creating an empty HashMap
		Map<String, Integer> hm = new HashMap<String, Integer>();

		// Inserting pairs in above Map
		// using put() method
		hm.put("a", new Integer(100));
		hm.put("b", new Integer(200));
		hm.put("c", new Integer(300));
		hm.put("d", new Integer(400));

		// Traversing through Map using for-each loop
		for (Map.Entry<String, Integer> me : hm.entrySet()) {

			// Printing keys
			System.out.print(me.getKey() + ":");
			System.out.println(me.getValue());
		}

		Map<String, Integer> map = new LinkedHashMap<>();

		// Inserting pair entries in above Map
		// using put() method
		map.put("vishal", 10);
		map.put("sachin", 30);
		map.put("vaibhav", 20);

		// Iterating over Map
		for (Map.Entry<String, Integer> e : map.entrySet())

			// Printing key-value pairs
			System.out.println(e.getKey() + " " + e.getValue());

		Map<String, Integer> map1 = new TreeMap<>();

		// Inserting custom elements in the Map
		// using put() method
		map1.put("vishal", 10);
		map1.put("sachin", 30);
		map1.put("vaibhav", 20);

		// Iterating over Map using for each loop
		for (Map.Entry<String, Integer> e : map1.entrySet())

			// Printing key-value pairs
			System.out.println(e.getKey() + " " + e.getValue());

		// changing elements

		Map<Integer, String> hm1 = new HashMap<Integer, String>();

		// Inserting the Elements
		hm1.put(new Integer(1), "Geeks");
		hm1.put(new Integer(2), "Geeks");
		hm1.put(new Integer(3), "Geeks");

		System.out.println("Initial Map " + hm1);

		hm1.put(new Integer(2), "For");

		System.out.println("Updated Map " + hm1);

		// removing elements

		Map<Integer, String> hm2 = new HashMap<Integer, String>();

		// Inserting the Elements
		hm2.put(1, "Geeks");
		hm2.put(new Integer(2), "For");
		hm2.put(new Integer(3), "Geeks");
		hm2.put(new Integer(4), "For");

		// Initial Map
		System.out.println(hm2);

		hm2.remove(new Integer(4));

		// Final Map
		System.out.println(hm2);
		
		
		
		// iterating through map

		Map<Integer, String> hm3 = new HashMap<Integer, String>();

		hm3.put(1,"Geeks");
		hm3.put(new Integer(2),"For");
		hm3.put(new Integer(3),"Geeks");

		for(Map.Entry<Integer, String> mapElement:hm3.entrySet())
		{
			int key = (int) mapElement.getKey();

			// Finding the value
			String value = (String) mapElement.getValue();

			System.out.println(key + " : " + value);
		}
		
		//count the occurence of numbers
		
		 int a[] = { 1, 13, 4, 1, 41, 31, 31, 4, 13, 2 };

	        // put all elements in arraylist
	        ArrayList<Integer> aa = new ArrayList<>();
	        for (int i = 0; i < a.length; i++) {
	            aa.add(a[i]);
	        }

	        HashMap<Integer, Integer> h = new HashMap<>();

	        // counting occurrence of numbers
	        for (int i = 0; i < aa.size(); i++) {
	            h.putIfAbsent(aa.get(i), Collections.frequency(aa, aa.get(i)));
	        }
	        System.out.println(h);
		
	        // compute method
	        
	        
	        Map<String, String> map2 = new HashMap<>(); 
	        map2.put("Name", "Aman"); 
	        map2.put("Address", "Kolkata"); 
	  
	        // Print the map 
	        System.out.println("Map: " + map2); 
	  
	        // remap the values using compute() method 
	        map2.compute("Name", (key, val) 
	                                -> val.concat(" Singh")); 
	        map2.compute("Address", (key, val) 
	                                   -> val.concat(" West-Bengal")); 
	  
	        // print new mapping 
	        System.out.println("New Map: " + map2); 
	        
	        
	        //contains value method
	        
	        
	        
	        HashMap<Integer, String> hash_map = new HashMap<Integer, String>(); 
	        
	        // Mapping string values to int keys 
	        hash_map.put(10, "Geeks"); 
	        hash_map.put(15, "4"); 
	        hash_map.put(20, "Geeks"); 
	        hash_map.put(25, "Welcomes"); 
	        hash_map.put(30, "You"); 
	  
	        // Displaying the HashMap 
	        System.out.println("Initial Mappings are: " + hash_map); 
	  
	        // Checking for the Value 'Geeks' 
	        System.out.println("Is the value 'Geeks' present? " +  
	        hash_map.containsValue("Geeks")); 
	  
	        // Checking for the Value 'World' 
	        System.out.println("Is the value 'World' present? " +  
	        hash_map.containsValue("World")); 
	        
	        
	        // entrySet() method
	        
	        
	        
	        HashMap<Integer, String> hash_map1 = new HashMap<Integer, String>(); 
	        
	        // Mapping string values to int keys 
	        hash_map1.put(10, "Geeks"); 
	        hash_map1.put(15, "4"); 
	        hash_map1.put(20, "Geeks"); 
	        hash_map1.put(25, "Welcomes"); 
	        hash_map1.put(30, "You"); 
	  
	        // Displaying the HashMap 
	        System.out.println("Initial Mappings are: " + hash_map1); 
	  
	        // Using entrySet() to get the set view 
	        System.out.println("The set is: " + hash_map1.entrySet());
	        
	        
	        
		
	}
}
