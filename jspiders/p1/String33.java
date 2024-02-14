package com.jspiders.p1;

public class String33 {
	public static void main(String[] args) {
		String s ="Hello hi Bye";
		String arr[] = s.split(" ");
		for(String ele:arr) {
			String s1=" ";
			for(int i=ele.length()-1;i>=0;i--) {
				s1=s1+ele.charAt(i);
			}
			System.out.println(s1+" ");
		}
	}
}
