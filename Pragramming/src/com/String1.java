package com;

public class String1 {
	public static void main(java.lang.String[] args) {
	String s1="hello";
	String s2="";
	for(int i=0;i<=s1.length()-1;i++) {
		if((s1.charAt(i)=='a')||(s1.charAt(i)=='e')||(s1.charAt(i)=='i')||(s1.charAt(i)=='o')||(s1.charAt(i)=='u')) {
			s2=s2+"$";
		}
		else {
			s2=s2+s1.charAt(i);
		}
	}
	System.out.println("ans is:"+s2);
		
	}
}
