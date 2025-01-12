package com.main;

import java.util.ArrayList;
import java.util.List;

import com.Animal;
import com.Dog;
import com.Fish;
import com.Horse;
import com.Mammal;

public class Main {
	public static void main(String[] args) {
		Dog dog = new Dog("Wolf", "big", 100);
		dog.makeNoise();
		doAnimalStuff(dog);
		List<Animal> animals = new ArrayList<>();
		
		animals.add(dog);
		animals.add(new Dog("German Shephard", "big", 150));
		animals.add(new Fish("GoldFish", "small", 1));
		animals.add(new Fish("barracuda", "big", 75));
		animals.add(new Dog("pug", "small", 20));
		animals.add(new Horse("Cydesdale" , "large", 1000));
		
		for(Animal animal : animals) {
			doAnimalStuff(animal);
			if(animal instanceof Mammal currentMammal) {
				currentMammal.shedHair();
			}
		}
		
	}
	
	
	private static void doAnimalStuff(Animal animal) {
		animal.makeNoise();
		animal.move("slow");
	}
}
