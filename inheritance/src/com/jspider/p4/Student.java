package com.jspider.p4;

public class Student  extends Person{
	String USN;
	double marks ;
	String collegename ;
	public Student(String name, int age, char gender, String uSN, double marks, String collegename) {
		super(name, age, gender);
		USN = uSN;
		this.marks = marks;
		this.collegename = collegename;
	}
	void details() {
		System.out.println("Name:"+this.name+"Age:"+this.age+"Gender:"+this.gender+"USN:"+this.USN+"college:"+this.collegename);

	}
}
