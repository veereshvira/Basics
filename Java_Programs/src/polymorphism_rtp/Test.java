package polymorphism_rtp;

public class Test {
	public static void main(String[] args) {
		Employee e = new Developer();
		e.work();
		Employee emp = new Tester();
		emp.work();
	}
}

