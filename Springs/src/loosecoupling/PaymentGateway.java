package loosecoupling;

interface PaymentGateway {
	void payment();
}
class Paytm implements PaymentGateway{
	public void payment() {
		System.out.println("Paying through Paytm");
	}
}
class Phonepe implements PaymentGateway{
	public void payment() {
		System.out.println("Paying through Phonepe");
	}
}
class AmazonPay implements PaymentGateway{
	public void payment() {
		System.out.println("Paying through AmazonPay");
	}
}
class Person1{
	private String name ="Jack";
	private PaymentGateway paymentGateway;//PaymentGateway pg = new Paytm(); or new Phonepe(); or new AmazonPay();
	
	public void setPaymentGateway(PaymentGateway paymentGateway) {
		this.paymentGateway = paymentGateway;
	}
	public PaymentGateway getPaymentGateway() {
		return paymentGateway;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
}
class Solution1{
	public static void main(String[] args) {
		
		Person1 person1 = new Person1();
		person1.setName("Tom");
		System.out.println("Name is :"+person1.getName());
		
		person1.setPaymentGateway(new AmazonPay());
		person1.getPaymentGateway().payment();
	}
}


























