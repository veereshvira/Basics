package com;

public class Bike implements Vehicle {
	@Override
	public void start() {
		System.out.println("Starting Bike");
	}

	@Override
	public void stop() {
		System.out.println("Stoping Bike");		
	}

	@Override
	public void move() {
		System.out.println("Moving a Bike");
	}
}
