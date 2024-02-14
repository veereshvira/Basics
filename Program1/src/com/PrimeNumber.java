package com;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		System.out.println("Enter a number to find its factors");
		int n=ip.nextInt();
		int count=0;
		for(int i=2;i<=2;i++) {
			if(n%i==0) {
				count++;
			}
		}
		System.out.println(count==0?n+" prime number":n+" not a prime number");
	}

	}

