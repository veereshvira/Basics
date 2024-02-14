package com;

import java.util.Scanner;

public class Factors {

	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter a number to find its factors");
		int n=s1.nextInt();
		int count=0;
		for(int i=2;i<=2;i++) {
			if(n%i==0) {
				count++;
			}
		}
		if(count==0) {
			System.out.println("Prime No");
		}
		else {
			System.out.println("Not a Prime No");
		}
//		System.out.println(count==0?n+"prime no":n+"not a prime no");
	}

}























