package comparable;

public class Watch implements Comparable<Watch> {
	String brand;
	Double cost;
	private Watch(String brand, double cost) {
		super();
		this.brand = brand;
		this.cost = cost;
	}
	@Override
	public int compareTo(Watch x) {
		
		return this.cost.compareTo(x.cost);
	}
	
	@Override
	public String toString() {
		return "Watch [brand=" + brand + ", cost=" + cost + "]";
	}
	
}
