package com;

public class RunnerException {
public static void main(String[] args) {
	int a=10;
	int b=9;
	int c=(a/b);
	try {
		System.out.println(c);
	}
	catch(Exception e) {
		System.out.println("We can't Divide by Zero(0)");
	}
}
}
