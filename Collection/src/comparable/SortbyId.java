package comparable;

import java.util.Set;
import java.util.TreeMap;

public class SortbyId {
	public static void main(String[] args) {
		Student s1 = new Student(1,"Tom");
		Student s2 = new Student(3, "jerry");
		Student s3 = new Student(2, "harry");
		
		TreeMap<Student, Double> t = new TreeMap<Student, Double>();
		t.put(s2, 309.9);
		t.put(s3, 93.9);
		t.put(s1, 333.9);
		Set<Student> key = t.keySet();
		for(Student k: key) {
			System.out.println(k+":"+t.get(k));
		}
	}
}
