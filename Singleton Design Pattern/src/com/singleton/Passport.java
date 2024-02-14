package com.singleton;

public class Passport {
	String name="Mrinal";
	int number =1234;
	
	private static Passport obj;
	
	private Passport() {
		System.out.println("Passport Generated");
	}
	
	public static Passport getInstance() {
		if(obj==null) {
			obj= new Passport();
		}
		return obj;
	}
}

