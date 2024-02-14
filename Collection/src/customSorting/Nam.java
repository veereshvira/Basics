package customSorting;

	import java.util.LinkedHashMap;
	import java.util.Set;

	public class Nam {
		int id;
		String name;
		public Nam(int id, String name) {
			super();
			this.id = id;
			this.name = name;
		}
		@Override
		public String toString() {
			return "Emp [id=" + id + ", name=" + name + "]";
		}
	}
	class Solutions {
		public static void main(String[] args) {
			LinkedHashMap<Nam, Double> lhm = new LinkedHashMap<Nam, Double>();
			
			Nam e1 = new Nam(123,"G");
			Nam e2 = new Nam(789,"H");
			Nam e3 = new Nam(456,"A");
			
			lhm.put(e1,22.45);
			lhm.put(e2,59.67);
			lhm.put(e3,21.50);
			
			Set<Nam> n = lhm.keySet();
			
			for(Nam key : n) {
				System.out.println(key+"Age:"+lhm.get(key));
			}
		}
	}

