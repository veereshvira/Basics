package threads;


public class Main {
	public static void main(String[] args) {
		Demo d = new Demo();
		d.setName("Demo");
		d.start();
		Demo2 d1 = new Demo2();
		d1.setName("demo2");
		d1.start();
	}
}
