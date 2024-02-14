package threads;

public class MainClass {
	public static void main(String[] args) {
		Sample sample = new Sample();
		sample.setName("Sample");
		sample.start();
		
		Sample1 sample1 = new Sample1();
//		sample1.setName("sam");
		sample1.start();
	}
}
