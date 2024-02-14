package com.jspiders.p1;

public class FindTheLowestWordInTheString {

	public static void main(String[] args) {
		String s ="Hey Rolex Hi Bye";
		String arr[] = s.split(" ");
		int min=arr[0].length();
		String ans=arr[0];
		for(String ele:arr)
				if(min>ele.length()) {
					min=ele.length();
					ans=ele;
				}
		System.out.println(ans);

	}

}
