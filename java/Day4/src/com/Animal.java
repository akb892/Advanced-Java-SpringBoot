package com;

//interface Walkable {
//	
//}
//public class Animal implements Walkable {
//	
//}

public class Animal  {
	public void eat() {
		System.out.println("Animal eat");
	}
}

class Dog extends Animal {
	@Override
	public void eat() {
		System.out.println("Dog eat");
	}
	
	public void bark() {
		System.out.println("Dog Bark");
	}
}

class Cat extends Animal {
	@Override
	public void eat() {
		System.out.println("Cat eat");
	}
	public void meow() {
		System.out.println("Cat Meows");
	}
}
