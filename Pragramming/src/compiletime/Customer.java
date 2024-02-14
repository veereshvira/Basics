package compiletime;

public class Customer {
	public static void main(String[] args) {
		Myntra m = new Myntra();
		m.purchase("GooglePay");
		m.purchase(2500);
		m.purchase("Shoe", 3000);
		m.purchase(15000, "Mobile");
		m.purchase("Adidas", "T-Shirt");
	}
}
