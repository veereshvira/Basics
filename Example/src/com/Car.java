package com;

public class Car implements Vehicle{

	@Override
	public void start() {
		System.out.println("Starting a Car");
	}

	@Override
	public void stop() {
		System.out.println("Stoping a Car");
	}

	@Override
	public void move() {
		System.out.println("Moving a Car");
	}

}
