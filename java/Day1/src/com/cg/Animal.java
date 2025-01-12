package com.cg;

public class Animal {
	public Animal() {
		System.out.println("Animal Default");
	}
	public Animal(String s) {
//		this();
		System.out.println("Animal Parameter");
	}
	public void eat() {
		System.out.println("Animal Eat");
	}
}

class Dog extends Animal {
	public Dog() {
//		super("a");
		System.out.println("Dog Default");
	}
	public Dog(String s) {
//		this();
		System.out.println("Dog Parameter");
	}
	@Override
	public void eat() {
		System.out.println("Dog eat");
	}
	
	public void bark() {
		System.out.println("Dog Bark....");
	}
}

class Puppy extends Dog {
	public Puppy() {
//		super("s");
		System.out.println("Puppy Default");
	}
	public Puppy(String s) {
//		this();
		System.out.println("Puppy Parameter");
	}
	public void eat() {
		System.out.println("Puppy eat");
	}
}
