package loosecoupling;

interface Vehicle {
	void travel();
}
class Bike implements Vehicle{
	public void travel() {
		System.out.println("Travelling through Bike");
	}
}
class Car implements Vehicle{
	public void travel() {
		System.out.println("Travelling through Bike");
	}
}
class Bus implements Vehicle{
	public void travel() {
		System.out.println("Travelling through Bike");
	}
}
class Person{
	String name; // String name ="Tom";
	Vehicle vehicle; // Vehicle vehicle = new Car(); or new Bike(); or new Bus();
	
	Person(String name, Vehicle vehicle) {
		this.name = name;
		this.vehicle = vehicle;
	}
	
}
class Solution{
	public static void main(String[] args) {
		
		Person person = new Person("Tom" , new Car());
		
		System.out.println("Name :"+person.name);
		person.vehicle.travel();
	}
}