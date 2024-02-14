package com;

public class Samp extends Sample{
	
	@Override
	void run() {

		System.out.println("Runnning with s1 reference");
	}
	public static void main(String[] args) {

		Sample s = new Samp();
		Samp s1 = (Samp) s;
		System.out.println(s1.a);
		
//		System.out.println(s.a);
		System.out.println(s.b);
		s.test();
		s1.run();
	}
}
