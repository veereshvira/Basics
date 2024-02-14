package com;

import java.util.Scanner;

public class Demo{

	static int len(String str)
	{

		if (str.equals(""))
			return 0;
		else
			return len(str.substring(1)) + 1;
	}

	public static void main(String[] args)
	{

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = sc.next();
		System.out.println(len(str));
	}
}



