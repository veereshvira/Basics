package compartor;

import java.util.Comparator;

public class SortByAge implements Comparator<Student>{

	@Override
	public int compare(Student x, Student y) {
		
		return x.age-y.age;
	}

}
