package com.jspiders.p1;

public class FindTheBiggestWordInTheString {

	public static void main(String[] args) {
		String s ="Hey Rolex Hi Bye";
		String arr[] = s.split(" ");
		int max=arr[0].length();
		String ans=arr[0];
		for(String ele:arr)
				if(max<ele.length()) {
					max=ele.length();
					ans=ele;
				}
		System.out.println(ans);
	}
}
