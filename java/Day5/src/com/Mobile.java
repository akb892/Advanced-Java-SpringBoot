package com;

public class Mobile implements ISoundable, IMyInterface {

	@Override
	public void play() {
		System.out.println("Mobile play with defaule VOL: " + defaultVolume);
		
	}

	@Override
	public void pause() {
		System.out.println("Mobile pause");
		
	}

	@Override
	public void stop() {
		System.out.println("Mobile stop");
		
	}

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		
	}

}

class Apple extends Mobile implements IMyInterface {
	
}
