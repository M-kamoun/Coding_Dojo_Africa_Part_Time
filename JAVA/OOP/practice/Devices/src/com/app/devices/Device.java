package com.app.devices;

public class Device {
	
	private int battery;

	public Device() {
		this.battery = 100;
	}
	
	public void status() {
		System.out.printf("Battery remaining : %d%%\n",this.battery);
	}

	public int getBattery() {
		return battery;
	}

	public void setBattery(int battery) {
		this.battery = battery;
	}
	
	public void decreaseBattery(int value) {
		this.battery-=value;
	}
	public void increaseBattery(int value) {
		this.battery+=value;
	}
	
	

}
