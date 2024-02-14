package threadsafe;

public class MainClass {
public static void main(String[] args) {
	Student s = new Student();
	s.setName("Student");
	s.start();
	
	Employee e = new Employee();
	e.setName("Employee");
	e.start();
	
	Train t = new Train();
	t.setName("Train");
	t.start();
}
}
