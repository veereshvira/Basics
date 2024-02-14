package customSorting;

import java.util.LinkedHashMap;
import java.util.Set;

public class Emp {
	int id;
	String name;
	public Emp(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + "]";
	}
}
class Solution1 {
	public static void main(String[] args) {
		LinkedHashMap<Emp, Double> lhm = new LinkedHashMap<Emp, Double>();
		
		Emp e1 = new Emp(123,"G");
		Emp e2 = new Emp(789,"H");
		Emp e3 = new Emp(456,"A");
		
		lhm.put(e1,22.45);
		lhm.put(e2,59.67);
		lhm.put(e3,21.50);
		
		Set<Emp> e = lhm.keySet();
		
		for(Emp key : e) {
			System.out.println(key+"Age:"+lhm.get(key));
		}
	}
}