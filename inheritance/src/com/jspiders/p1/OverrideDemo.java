package com.jspiders.p1;
  class d1{
	public void display() {
		System.out.println("how");
	}
	}
  class d2 extends d1{
	 public	void display() {
		System.out.println("hello");
	}
	}
  class d3 extends d2{
	 public	void display() {
		System.out.println("are you?");
	}
	}

public class OverrideDemo {

	public static void main(String[] args) {
		
		d1 A = new d1();
		d2 B = new d2();
		d3 C = new d3();
	}

}
