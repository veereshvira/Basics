package com.org;

public class p1
{
	public static void main(String[] args) {
		String str="I_Love_India";
//		str= str.toLowerCase();
		String s[]=str.split("_");
		for(int i=0;i<s.length;i++) {
			System.out.println(s);
		}
	}
}
