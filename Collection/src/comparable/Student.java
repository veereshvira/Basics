package comparable;

public class Student implements Comparable<Student>{
	int id;
	String name;

	Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}

	@Override
	public int compareTo(Student x) {
		// TODO Auto-generated method stub
		return this.id-x.id;
	}

}
