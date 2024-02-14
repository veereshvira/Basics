package new_programs;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class Didw {

	public static void main(String[] args) {
		Map<String, Integer> m = new TreeMap<>(Comparator.reverseOrder());
		m.put("a", 99);
		m.put("B", 990);
		m.put("i", 8);
		System.out.println(m);

	}
}
