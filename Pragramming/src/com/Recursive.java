package com;

public class Recursive {

	static int func(int n) {
		if(n<=10) {
			return n+func(n+1);

		}
		else {
			return 0;
		}
	}
	
	public static void main(String[] args) {
		System.out.println(func(1));
	}
}
