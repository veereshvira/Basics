package encapsulation;

public class MainClass {
	public static void main(String[] args) {
		Student s = new Student();
		s.setId(1);
		s.setName("Veeresh");
		s.setPhone(8792552162l);
		System.out.println(s.getClass());
		System.out.println(s.getId());
		System.out.println(s.getName());
		System.out.println(s.getPhone());
	}
}
