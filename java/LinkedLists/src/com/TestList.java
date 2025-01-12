package com;

public class TestList {
	
	public static void main(String[] args) {
		LinkedListDemo ll = new LinkedListDemo();
//		LinkedListDemo ll1 = new LinkedListDemo();
		ll.addFirst(5);
		ll.addFirst(3);
		ll.addFirst(7);	
//		ll.addLast(10);
		ll.addLast(10);
		
		
		ll.printList();
		System.out.println();
		System.out.println(ll.getSize());
		System.out.println();
		ll.removeFirst();
		ll.removeLast();
		ll.printList();
		System.out.println();
		System.out.println(ll.getSize());
		
		System.out.println();
		System.out.println(ll.getElement(1));
		
//		ll1.addLast(5);
//		ll1.addLast(3);
//		ll1.addLast(7);
//		
//		ll1.printList();
	}
}
