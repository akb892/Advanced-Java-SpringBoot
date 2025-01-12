package com;

//import java.util.LinkedList;

class Node {
	static int count;
	int data;
	Node next;

	Node(int data) {
		this.data = data;
		this.next = null;
		count++;
	}

}

public class LinkedListDemo {

	Node head;
	Node tail;
	int count = 0;

	public void addFirst(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			count++;
			return;
		} else {
			newNode.next = head;
			head = newNode;
			count++;
		}
	}

	public void addLast(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
//			tail = newNode;
			count++;
			return;
		}
//		else {
//			tail.next = newNode;
//			tail = newNode;
//		}
		Node temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}
		temp.next = newNode;
		count++;
	}

	public void removeFirst() {
		if (head == null) {
			System.out.println("List is empty");
			return;
		} else {

			Node.count--;
//			count--;
			head = head.next;

		}
	}

	public void removeLast() {
		if (head == null) {
			System.out.println("List is empty");
			return;
		}
		if (head.next == null) {
			Node.count--;
//			count--;
			head = null;
			return;
		}
		Node temp = head;

		Node temp2 = temp.next; // Node temp2 = head.next;

		while (temp2.next != null) {
			temp2 = temp2.next;
			temp = temp.next;
		}
		Node.count--;
//		count--;
		temp.next = null;
		temp2 = null;
	}

	public int getSize() {
//		if(head == null) {
//			System.out.println("List is empty");
//			return 0;
//		}
//		Node temp = head;
//		int count = 0;
//		while(temp !=null) {
//			count++;
//			temp = temp.next;
//		}
//		return count;
		return Node.count;
	}

	public int getElement(int pos) {
		if (head == null) {
			System.out.println("List is empty");
			return -1;
		}
		if(pos < Node.count) {
			System.out.println("Element not present");
			return -1;
		}
		int count1 = 0;
		Node temp = head;
		while (temp != null) {
			if (count1 == pos) {
				return temp.data;
			}

			count1++;
			temp = temp.next;

		}
		return -1;
	}

	public void printList() {
		if (head == null) {
			System.out.println("List is Empty");
			return;
		}
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " => ");
			temp = temp.next;
		}
	}

//	public static void main(String[] args) {
//		LinkedList<String> li = new LinkedList<>();
//		li.push("Aryan");
//		li.push("Dipti");
//		li.push("Parushi");
//		System.out.println(li);
//		
//		li.pop();
//		System.out.println(li);
//	}
}
