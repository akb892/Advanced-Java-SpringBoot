package com;

public class Main {
	public static void main(String[] args) {
		ISoundable obj = new Laptop();
		obj.play();
		obj.pause();
		obj.stop();
		
		
		ISoundable obj1 = new Mobile();
		obj1.play();
		obj1.pause();
		obj1.stop();
	}
}
