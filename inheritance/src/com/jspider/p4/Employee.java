package com.jspider.p4;

public class Employee extends Person{
	int empid;
	double salary;
	String designation;
	public Employee(String name, int age, char gender, int empid, double salary, String designation) {
		super(name, age, gender);
		this.empid = empid;
		this.salary = salary;
		this.designation = designation;
	}

	void details() {
			System.out.println("Name:"+this.name+"Age:"+this.age+"Gender:"+this.gender+"id:"+this.empid+"Salary:"+this.salary+"Designation:"+this.designation);
	}
}


