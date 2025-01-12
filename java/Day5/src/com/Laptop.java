package com;

public class Laptop implements ISoundable{

	@Override
	public void play() {
		System.out.println("Laptop Play with default VOL = " + defaultVolume);
	}

	@Override
	public void pause() {
		System.out.println("Laptop Pause");
		
	}

	@Override
	public void stop() {
		System.out.println("Laptop Stop");
		
	}

}


