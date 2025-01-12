package com;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {
	
	 public static void main(String[] args) {
	        Queue<String> queue = new LinkedList<>();

	        // add elements to the queue
	        queue.add("apple");
	        queue.add("banana");
	        queue.add("cherry");

	        // print the queue
	        System.out.println("Queue: " + queue);

	        // remove the element at the front of the queue
	        String front = queue.remove();
	        System.out.println("Removed element: " + front);

	        // print the updated queue
	        System.out.println("Queue after removal: " + queue);

	        // add another element to the queue
	        queue.add("date");

	        // peek at the element at the front of the queue
	        String peeked = queue.peek();
	        System.out.println("Peeked element: " + peeked);

	        // print the updated queue
	        System.out.println("Queue after peek: " + queue);
	        
	        
	        
	        
	        
	        
	        //Priority Queue
	        
	        
	        
	        
	        Queue<String> pq = new PriorityQueue<>();

	        pq.add("Geeks");
	        pq.add("For");
	        pq.add("Geeks");

	        System.out.println("Initial Queue " + pq);

	        pq.remove("Geeks");

	        System.out.println("After Remove " + pq);

	        System.out.println("Poll Method " + pq.poll());

	        System.out.println("Final Queue " + pq);
	        
	        
	        
	        
	        
	        
	        //iterating queue
	        
	        
	        
	        Queue<String> pq1 = new PriorityQueue<>();

	        pq1.add("Geeks");
	        pq1.add("For");
	        pq1.add("Geeks");

	        Iterator iterator = pq1.iterator();

	        while (iterator.hasNext()) {
	            System.out.print(iterator.next() + " ");
	        }
	       
	    }
}
