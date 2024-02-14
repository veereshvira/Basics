package com;

public class StringReplace {

	public static void main(String[] args) {
		String s1="HEllo";
		String s2="";
		int c=0;
		int s=0;
		for(int i=0;i<=s1.length()-1;i++) {
			if(s1.charAt(i)>='A'&&s1.charAt(i)<='Z') {
				c++;
				char value=(char)(s1.charAt(i)+32);
				s2=s2+value;
			}
			else if(s1.charAt(i)>='a'&&s1.charAt(i)<='z') {
				s++;
				s2=s2+s1.charAt(i);
			}
		}
		System.out.println("capital case:"+c);
		System.out.println("small case:"+s);
		System.out.println("previous string:"+s1);
		System.out.println("converted string:"+s2);
	}
}
