package com;

public class Demo {
	public static void main(String[] args) {
		String s1="HEllo";
		int c=0;
		int s=0;
		for(int i=0;i<=s1.length()-1;i++) {
			if(s1.charAt(i)>='A'&&s1.charAt(i)<='Z') {
				c++;
			}
			else if(s1.charAt(i)>='a'&&s1.charAt(i)<='z') {
				s++;
			}
		}
		System.out.println("capital case:"+c);
		System.out.println("small case:"+s);
	}
}
