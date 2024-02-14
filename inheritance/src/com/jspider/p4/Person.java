package com.jspider.p4;

public class Person {
	String name;
	int age;
	char gender;
	
	//parameterized constructor
	Person(String name,int age,char gender){
		this.name=name;
		this.age=age;
		this.gender=gender;
	}
	void details() {
		System.out.println("Name:"+this.name+"Age:"+this.age+"Gender:"+this.gender);
	}
}
