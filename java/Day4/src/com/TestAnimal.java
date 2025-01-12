package com;
public class TestAnimal {
	public static void main(String[] args) {
//		Dog p = new Dog();
//		
//		System.out.println(p instanceof Walkable);
		
		Animal animals[] = {new Animal(),new Dog(), new Cat()};
		
		for (Animal obj: animals) {
			obj.eat();
			if(obj instanceof Dog) {
				((Dog)obj).bark();
			}
			else if(obj instanceof Cat) {
				((Cat)obj).meow();
			}
		}
		
	}
}
