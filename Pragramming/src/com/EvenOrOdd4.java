package com;

public class EvenOrOdd4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=8;
		if((n>>1<<1)==n) {
			System.out.println(n+": is Even number");
		}
		else
		{
			System.out.println(n+": is Odd number");
		}
	}

}
