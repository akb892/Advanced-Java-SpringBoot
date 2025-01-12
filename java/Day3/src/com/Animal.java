package com;

public abstract class Animal {
	public Animal() {
		System.out.println("Animal Constructor");
	}
	public abstract void eat();
	public void displayAnimalName(String name) {
		System.out.println("Name = " + name);
	}
}

class Dog extends Animal{

	@Override
	public void eat() {
		System.out.println("Dog eat");
	}
	
}

class Cow extends Animal {

	@Override
	public void eat() {
		System.out.println("Cow eat");
	}
	
}
