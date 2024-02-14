package com.jspiders.p1;

public class SplitTheString {
public static void main(String[] args) {
	
	String s="Hello hi Bye";
	String arr[]=s.split(" ");
	for(String ele:arr) {
		System.out.print(ele);
	}
}
}
