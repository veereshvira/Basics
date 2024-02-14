package inheritance;

class Animal {
	static Doggy d;
	void eat() {
		System.out.println("eating....");
	}
}
class Doggy extends Animal{
	void bark() {
		System.out.println("Barking....");
	}
}
class Cat extends Animal{
	void meow(){
		System.out.println("Meowing...");
	}
}