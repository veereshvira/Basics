package inheritance;

public class MainClass1 {
	public static void main(String[] args) {
		Employee1 e1 = new Developer();
		Developer d1 = (Developer) e1;
		System.out.println(d1.a);
		d1.disp();
		System.out.println(d1.b);
		d1.work();
	}
}