package com.org;


public class sets{
public static void main(String[] args) {
	String str ="My name is veeresh";
	String str1="";
	String s[] = str.split(" ");
	for(int i=0;i<s.length;i++) {
		System.out.print(s[i]+" ");
	}
	System.out.println(" ");
	for(int i=s.length-1;i>=0;i--) {
		str1= str1+s[i]+" ";
	}
	System.out.println(str1);
}
}
