package com;

public interface ISoundable {
	int defaultVol = 10;
	void play();
	void pause();
	void stop();
	
	public default void playMp4() {
		
	}
	
	public static void display() {
		System.out.println("Static method of interface");
	}
	
}
