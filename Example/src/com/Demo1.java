package com;

public class Demo1{
	public static void main(String[] args)
	{
		for(int i=1; i<=5; i++)
		{
			if(i==4 || i==5)
			{
				continue;
			}
			System.out.println(i);
		}
		System.out.println("------");
		for(int i=1; i<=5; i++)
		{ 
			if(i==3 && i==5)
			{
				break;
			}
			System.out.println(i);
		}
		System.out.println("------");
		for(int i=1; i<=5; i++)
		{
			if(i==2 && i==3)
			{
				continue;
			}
			System.out.println(i);
		}
	}
}
