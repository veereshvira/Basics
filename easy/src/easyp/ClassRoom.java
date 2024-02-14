package easyp;

public class ClassRoom {
public static void main(String[] args) {
	Trainer t = new Trainer();
	
	Student s1 = new Student("v ", t);
	Student s2 = new Student("s ", t);
	Student s3 = new Student("a ", t);
	
	s1.start();
	s2.start();
	s3.start();
	
}
}
