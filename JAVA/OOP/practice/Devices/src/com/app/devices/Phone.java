package com.app.devices;

public class Phone extends Device {
	
	
	// making a call method
	public void makeCall() {
		if(getBattery()>0) {
			decreaseBattery(5);
			System.out.println("you make a call...");
			
			
		}
		else {
			System.out.println("your battery is low to make a call");
		}
		status();
		checkCriticalCharge();
	}
	
	//playing a game method
	public void playGame() {
		if(getBattery()>=25) {
			decreaseBattery(10);
			System.out.println("you play a game...");
			
		}
		else {
			System.out.println("your battery is low 25 % to play a game");
		}
		status();
		checkCriticalCharge();
	}
	
	//charging method
	public void charging() {
		if(getBattery()<=50) {
			increaseBattery(50);
			System.out.println("In charge...");
			
		}
		else {
			System.out.println("your battery is charged");
		}
		status();
		
	}
	
	
	
	
	public void checkCriticalCharge() {
		if(getBattery()<=10) {
			System.out.println("battery critical ! please charge your phone!");
		}
		
	}
	
	
	
	

}
