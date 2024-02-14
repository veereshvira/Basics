package com;

public class empty {
	public static void main(String[] args) {
		int n=4,c=0;
		for(int i=0;i<=n;i++) {
			if(n%i==0) {
				c++;
			}
		}
		if(c==0) {
			System.out.println("Prime No");
		}
		else
			System.out.println("Not a Prime");
	}
	
}
