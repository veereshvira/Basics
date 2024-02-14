package com.jspider.p1;

public class Sample1 {
//function with primitive type parameter
	void disp(int arg1) {
		System.out.println("running disp(int) method");
		System.out.println("arg1 valueis"+arg1);
	}
	//function with non-primitive type parameter
	void show(Demo1 arg1) {
		System.out.println("running show() method");
		System.out.println("arg1 value is"+arg1);
		System.out.println("x value is"+arg1.x);
		arg1.test();
	}
}
