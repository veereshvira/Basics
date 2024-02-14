package com;

public class TestVehicle {
	public static void main(String[] args) {
			Bike b = new Bike();
			Car c = new Car();
			
			Driver d = new Driver();
			d.driving(b);
			System.out.println("=============== ");
			d.driving(c);
		}
}



	
