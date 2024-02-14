package com.singleton;

public class Person {

	public static void main(String[] args) {
		Passport obj =Passport.getInstance();
		System.out.println("Name: "+obj.name+"\nNumber: "+obj.number);
	}

}
