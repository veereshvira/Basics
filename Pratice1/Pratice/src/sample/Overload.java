package sample;

public class Overload {
	 void demo() {
		System.out.println("The is method with no parameter is called");
	}
	 void demo(int a) {
		System.out.println("The value of a :"+a);
	}
	 void demo(boolean b) {
		System.out.println("The is Present in class :"+b);
	}
	
	public static void main(String[] args) {
		Overload o = new Overload();
		o.demo();
		o.demo(false);
		o.demo(89);
		
	}
}
