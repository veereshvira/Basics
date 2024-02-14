package customSorting;
import java.util.ArrayList;
import java.util.Collections;

public class Student implements Comparable<Student> {
	int id;
	String name;

	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}

	@Override
	public int compareTo(Student s) {
		// TODO Auto-generated method stub
		return this.name.compareTo(s.name);
	}
}
class Solution{
	public static void main(String[] args) {
		ArrayList<Student> a = new ArrayList<Student>();
		a.add(new Student(123, "A"));
		a.add(new Student(789, "D"));
		a.add(new Student(456, "G"));
		
		
		Collections.sort(a);
		
		for(Student s:a) {
			System.out.println(s);
		}

	}
}





