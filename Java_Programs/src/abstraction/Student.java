package abstraction;

public class Student implements College {
	@Override
	public void exam() {
		System.out.println("Exams are going on...");
	}

}
