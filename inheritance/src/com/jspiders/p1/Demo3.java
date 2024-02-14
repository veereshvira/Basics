package com.jspiders.p1;

public class Demo3 {
	int x=10;
	void test()
	{
		System.out.println("running test() method");
	}
}
class Demo4 extends Demo3
{
	int y=20;
	void disp()
	{
		System.out.println("running disp() method");
	}
}
class Demo5 extends Demo4
{
	int z=30;
	void view()
	{
		System.out.println("running() view");
	}
}