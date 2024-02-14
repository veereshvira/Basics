package polymorphism_ctp;


public class Myntra {
	void purchase(int cost)
	{
		System.out.println("Cost: Rs."+cost);
	}
	void purchase(String brand, String product)
	{
		System.out.println("Brand: "+brand+" Product "+product);
	}
	void purchase(String paymentGateway)
	{
		System.out.println("Payment Gateway: "+paymentGateway);
	}
	void purchase(String product, int cost)
	{
		System.out.println("Product: "+product+" Cost: "+cost);
	}
	void purchase(int cost, String product)
	{

		System.out.println("Cost: "+cost+" Product: "+product);
	}
}
