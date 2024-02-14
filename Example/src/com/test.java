package com;

public class test {
	static int counttheSrting(String str) {
		int String_length=0;
		if (str.equals("")) {
		return 0;
		}
		else {
			String st ="";
			return counttheSrting(str.substring(1)) + 1;
		}
}
	public static void main(String[] args) {
		System.out.println(counttheSrting("hello"));
	}
			
}
