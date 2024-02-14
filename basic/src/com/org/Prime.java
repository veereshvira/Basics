package com.org;

public class Prime {
	public static void main(String[] args) {
		for(int n=1;n<=100;n++) {
			int c=0;
			for(int i=0;i<=n;i++) {
				if(n%i==0) {
					c++;
				}
			}
			if(c==0) {
				System.out.println(n);
			}
		}
	}
}
