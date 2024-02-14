package com;

public class Factorial {

	public static void main(String[] args) {
		int n=3;
		int fact=1;
		for(int i=1;i<=n;i++) {
			fact = fact*i;
		}
		System.out.println("Factorial of given number "+n+"is " +fact);
	}

}
