package com;

public class vowelsAndConsonats {
	public static void main(String[] args) {
		int c=0,v=0;
		String str="hey how are you";
		str=str.toLowerCase();
		
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u') {
				v++;
			}
			else if(str.charAt(i)>='a'&& str.charAt(i)<='z') {
				c++;
			}
//			System.out.println(str.charAt());
		}
		System.out.println("Vowels "+v);
		System.out.println("Consonants "+c);
		System.out.println("===========================");
	}
}
//		char ch='z';
//		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
//			System.out.println("Given Alphabet is Vowels");
//		}
//		else
//			System.out.println("Given Alphabet is Consonants");
//				System.out.println("============================");

//		char ch ='z';
//		switch(ch) {
//		case 'a':
//		case 'e':
//		case 'i':
//		case 'o':
//		case 'u':
//			System.out.println(ch+" is vowels");
//			break;
//			
//		default :System.out.println(ch+" is consonants");
//		}
//	}
//}  
