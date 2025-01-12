package com.cg.main;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;

import com.cg.bean.Student;
import com.cg.sort.SortByName;

public class QueueDemo {
	
	public static void main(String[] args) {
		/*
		 * Queue<String> q = new PriorityQueue<>();
		 * 
		 * q.add("A"); q.offer("D"); q.offer("C"); q.offer("B"); q.offer("E");
		 * 
		 * 
		 * System.out.println(q);
		 */
		
		
		Queue<Student> q = new PriorityQueue<>(new SortByName());
		
		q.offer(new Student("A", 87));
		q.offer(new Student("B", 90));
		q.offer(new Student("C" , 56));
		q.offer(new Student("E", 75));
		q.offer(new Student("D", 88));
		
		
		/*
		 * List<Student> li = new ArrayList<>(); li.addAll(q);
		 * 
		 * Set<Student> st = new TreeSet<>(new SortByName()); st.addAll(q);
		 */		
		System.out.println(q);
		System.out.println(q.size());
		System.out.println(q.poll());
		System.out.println(q.poll());
		System.out.println(q.poll());
		System.out.println(q.poll());
		System.out.println(q.poll());
		System.out.println(q.size());
		
	}
}
