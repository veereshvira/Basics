package com;

public class b extends a{

	@Override
	void tester() {
		System.out.println("Running tester() in b class");
	}
	
	@Override
	void test() {
		System.out.println("Override ->Running test() in b class");
		System.out.println("Implementation Changed");
	}
	public static void main(String[] args) {
		b b1 = new b();
		b1.test();
		b1.tester();
	}

}
