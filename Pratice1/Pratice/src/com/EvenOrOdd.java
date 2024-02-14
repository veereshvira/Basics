package com;

import java.util.Scanner;

public class EvenOrOdd {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		int n=s.nextInt();
		if(n%2==0) {
			System.out.println("The given number is even");
		}
		else if(n%2==1) {
			System.out.println("The given number is odd");
		}
		else {
			System.out.println("Not a number");
		}
		
	}
}
