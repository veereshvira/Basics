package com.jspiders.p1;

public class demo1 {
	public static void main(String [] args)
	{
		int a =10,b=20,c=30,d=40,e=0;
		System.out.println(a<b&&b<d);
		System.out.println((a>b||a!=d)&&(c>a||d==e));
		System.out.println(!((c!=d&&c==b)||(c>b||e>a)));
		a+=10;
		b+=20;
		b-=10;
		e*=20;
		System.out.println((a>b||a!=d)&&(c>a||d==e));
		System.out.println(!((c!=d&&c==b)||(c>b||e>a)));
		e=a++ + b++ +--c + ++d-c-d+++a;
		System.out.println((a>b||a!=d)&&(c>a||d==e));
		System.out.println(!((c!=d&&c==b)||(c>b||e>a)));
		
	}

}