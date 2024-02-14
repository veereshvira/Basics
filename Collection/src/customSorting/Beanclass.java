package customSorting;

public class Beanclass {
	private int id;
	private String name;

	public void setId(int id) {
		this.id=id;
	}
	public int getId() {
		return id;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
}
class solution{
	public static void main(String[] args) {
		Beanclass b1 = new Beanclass();
		
		b1.setId(12);
		b1.setName("Harshi");
		System.out.println(b1.getId());
		System.out.println(b1.getName());
	}
}
