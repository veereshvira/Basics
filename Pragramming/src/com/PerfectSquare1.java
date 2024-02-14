package com;

import java.util.Scanner;

public class PerfectSquare1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=s1.nextInt();
		int flag=0;
		for(int i=1;i<=n;i++) {
			if(i*i==n) 
			{flag=1;
			break;
			}
		}
		if(flag==1) {
				System.out.println("Perfect Square");
			}
			else {
				System.out.println("Not a Perfect Square");	
				}
			}
		}
