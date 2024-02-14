package com.jspiders.p1;

public class Count {
	public static void main(String[] args) {
		int n=12345,c=0;
		while(n!=0){
			n=n/10;
			c++;
		}
		System.out.println(c);
	}
}
