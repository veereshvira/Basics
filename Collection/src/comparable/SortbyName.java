package comparable;

import java.util.ArrayList;
import java.util.Collections;

public class SortbyName {
	public static void main(String[] args) {
		Student s = new Student(3, "Virat");
		Student s1 = new Student(2, "Rohit");
		Student s2 = new Student(1, "Rahul");
		Student s3 = new Student(4, "hardik");
		ArrayList<Student> al = new ArrayList<Student>();
		al.add(s3);
		al.add(s);
		al.add(s2);
		al.add(s1);
		
		Collections.sort(al);
		for(Student ss:al) {
			System.out.println(ss);
		}
	}
}
