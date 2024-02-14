package com.jspider.p1;

public class MainClass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample1 s1 = new Sample1();
		
		s1.disp(125);
		s1.show(new Demo1());
		
		System.out.println("==========");
		int x=250;
		s1.disp(x);
		
		Demo1 d1 = new Demo1();
		s1.show(d1);//pass object reference
	}

}
