package com.jspider.p1;

public class MainClass1 {
	public static void main(String[] args) {
		// 3type of Animals
		Dog d1 = new Dog();
		Cat c1 = new Cat();
		Snake s1 = new Snake();
		
		AnimalSimulator as1 = new AnimalSimulator();
		as1.makenoise(d1);
		as1.makenoise(c1);
		as1.makenoise(s1);
	}
}
