package com;

import java.util.Scanner;

public class GreatestOf3 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter First number");
	int a=sc.nextInt();
	System.out.println("Enter Second number");
	int b=sc.nextInt();
	System.out.println("Enter Third number");
	int c=sc.nextInt();
	
	if(a>b&&a>c) {
		System.out.println("A is Greater");
	}
	else if (b>a&&b>c) {
		System.out.println("B is Greater");
	}
	else {
		System.out.println("C is Greater");
	}
	
}
}
