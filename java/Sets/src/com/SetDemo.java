package com;

import java.util.Arrays;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

enum Gfg { CODE, LEARN, CONTRIBUTE, QUIZ, MCQ }
;

public class SetDemo {

	public static void main(String args[]) {
		// Creating an object of Set class
		// Declaring object of Integer type
		Set<Integer> a = new HashSet<Integer>();

		// Adding all elements to List
		a.addAll(Arrays.asList(new Integer[] { 1, 3, 2, 4, 8, 9, 0 }));

		// Again declaring object of Set class
		// with reference to HashSet
		Set<Integer> b = new HashSet<Integer>();

		b.addAll(Arrays.asList(new Integer[] { 1, 3, 7, 5, 4, 0, 7, 5 }));

		// To find union
		Set<Integer> union = new HashSet<Integer>(a);
		union.addAll(b);
		System.out.print("Union of the two Set");
		System.out.println(union);

		// To find intersection
		Set<Integer> intersection = new HashSet<Integer>(a);
		intersection.retainAll(b);
		System.out.print("Intersection of the two Set");
		System.out.println(intersection);

		// To find the symmetric difference
		Set<Integer> difference = new HashSet<Integer>(a);
		difference.removeAll(b);
		System.out.print("Difference of the two Set");
		System.out.println(difference);

		// iterating using iterator

		Set<String> h = new HashSet<String>();

		// Adding elements into the HashSet
		// using add() method

		// Custom input elements
		h.add("India");
		h.add("Australia");
		h.add("South Africa");

		// Adding the duplicate element
		h.add("India");

		// Displaying the HashSet
		System.out.println(h);

		// Removing items from HashSet
		// using remove() method
		h.remove("Australia");
		System.out.println("Set after removing " + "Australia:" + h);

		// Iterating over hash set items
		System.out.println("Iterating over set:");

		// Iterating through iterators
		Iterator<String> i = h.iterator();

		// It holds true till there is a single element
		// remaining in the object
		while (i.hasNext())

			System.out.println(i.next());
		
		
		
		//enumset
		
		Set<Gfg> set1;

        // Adding the elements
        set1 = EnumSet.of(Gfg.QUIZ, Gfg.CONTRIBUTE,
                          Gfg.LEARN, Gfg.CODE);

        System.out.println("Set 1: " + set1);
        
		
		
	}
}
