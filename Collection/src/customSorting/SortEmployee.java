package customSorting;

import java.util.TreeSet;

public class SortEmployee {
	public static void main(String[] args) {
		TreeSet<Employee> t = new TreeSet<>(new Sortbyid());
		t.add(new Employee(200));
		t.add(new Employee(400));
		t.add(new Employee(100));
		t.add(new Employee(300));
		
		for(Employee e : t) {
			System.out.println(e);
		}
	}
}
