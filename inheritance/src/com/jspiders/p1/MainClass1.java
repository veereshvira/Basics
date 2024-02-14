package com.jspiders.p1;

public class MainClass1 {

	public static void main(String[] args) {
		
		Demo2 d1 = new Demo2();
		//inherited member
		System.out.println("x value is:" +d1.x);
		d1.test();
		//own member
		System.out.println("y value is:" +d1.y);
		d1.disp();
	}

}
