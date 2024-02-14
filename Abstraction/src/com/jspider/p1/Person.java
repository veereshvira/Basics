package com.jspider.p1;

abstract class Person {
	abstract void work();
}

class Tom extends Person {
	@Override
	void work() {
		// TODO Auto-generated method stub
		System.out.println("Working");
	}
}
