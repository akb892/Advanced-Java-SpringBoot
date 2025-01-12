package com.cg;

public class TestAnimal {
	public static void main(String[] args) {
		Animal obj = new Animal();
		obj.eat();
		obj = new Dog();
		obj.eat();
		obj = new Puppy();
		obj.eat();
		((Dog)obj).bark();
	}
}
