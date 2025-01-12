package com;

public class TestAnimal {
	public static void main(String[] args) {
		Animal obj = new Dog();
		obj.eat();
		obj = new Cow();
		obj.eat();
	}
}
