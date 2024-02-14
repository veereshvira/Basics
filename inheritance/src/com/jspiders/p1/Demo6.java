package com.jspiders.p1;

public class Demo6 {
	int x=10;
	void test()
	{
		System.out.println("running test() method");
	}
}
class Demo7 extends Demo6
{
	int y=20;
	void disp()
	{
		System.out.println("running disp() method");
	}
}
class Demo8 extends Demo6
{
	int z=30;
	void view()
	{
		System.out.println("running view() method");
	}
}