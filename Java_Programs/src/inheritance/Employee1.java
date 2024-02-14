package inheritance;

public class Employee1 {
	int a = 10;

	void disp() {
		System.out.println("working");
	}
}

class Developer extends Employee1 {
	int b = 20;

	void work() {
		System.out.println("Developing");
	}
}
