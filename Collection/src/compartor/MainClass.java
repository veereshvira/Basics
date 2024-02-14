package compartor;

import java.util.TreeSet;

public class MainClass
{
	public static void main(String kitty []) {
		TreeSet<Student> t = new TreeSet<Student>(new SortByName());
//		t.add(new Student(15));
//		t.add(new Student(14));
//		t.add(new Student(13));
//		t.add(new Student(16));
		t.add(new Student(10,"santhu"));
		t.add(new Student(11,"veere"));
		t.add(new Student(10,"kitty"));
		t.add(new Student(13,"mrinal"));
		
		for(Student s :t) {
			System.out.println(s);
		}
	}
}
