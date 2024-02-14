package inheritance;

public class Student2 {
	void test() {
		int id1 = 01;
		System.out.println(id1);
		String name1 = "Veeresh";
		System.out.println(name1);
	}
}

class Student3 extends Student2 {
	void disp() {
		int id2 = 02;
		String name2 = "vere";
		System.out.println(id2);
		System.out.println(name2);
	}
}

class Student4 extends Student3 {
	void demo() {
		int id3 = 03;
		String name3 = "vira";
		System.out.println(id3);
		System.out.println(name3);
	}
}