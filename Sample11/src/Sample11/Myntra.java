package Sample11;

public class Myntra {
	Myntra(String product) {
		System.out.println(product);
	}

	Myntra(int productid) {
		System.out.println(productid);
	}

	Myntra(String product, int cost) {
		System.out.println(product + "" + cost);
	}

	Myntra(int cost, String product) {
		System.out.println(cost + "" + product);
	}

	public static void main(String[] args) {
		new Myntra(45);
		new Myntra("watch");
		new Myntra(8000, "-Tommy");
		new Myntra("Fossil", -8000);
		
	}
}
