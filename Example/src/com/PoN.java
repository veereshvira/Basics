package com;

import java.util.Scanner;

public class PoN {
	public static void main(String[] args) throws Exception {

		postive p = new postive();
		
		Scanner s = new Scanner(System.in);
		for(int i=1;i<=5;i++)
			try {
				{
					System.out.println("Enter the number");

					int a=s.nextInt();
					p.num(a);
					System.out.println("----------------");
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println("Invalid input from the user");
				System.out.println("Exception Handled");
			}
	}
}