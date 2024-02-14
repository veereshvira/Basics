

package com;

public class Largest1 {
		public static void main(String[] args) {
			int a=100,b=50,c=500,d=40;
			if(a>=b)
			{
				if(a>=c)
				{
					if(a>=d) 
					{
						System.out.println(a+" : greater");
					}
					else 
					{
						System.out.println(d+" : is greater");
					}
				}
				else 
				{
					if(c>=d)
					{
						System.out.println(c+" : is greater");
					}
					else
					{
						System.out.println(d+ " : is greater");
					}
				}
			}
			else
			{
				if(b>=c) 
				{
					if(b>=d) 
					{
						System.out.println(b+ " : is greater");
					}
					else 
					{
						System.out.println(d+ " : is greater");
					}
				}
				else
				{
					if(c>=d)
					{
						System.out.println(c+ " : is greater");
					}
					else
					{
						System.out.println(d+ " : is greater");
					}
				}
			}
		}
	}




































