package Classtypecasting;

public class MainClass1 {

	public static void main(String[] args) {
		
		Demo1 d1 = (Demo1) new Demo2();
		//Demo2 is casted to Demo1
		//Subclass is casted to superclass--> UPCASTING
		Demo2 d2 = (Demo2) new Demo2();
		//Demo1 is casted to Demo2
		//Superclass is casted to Subclass--> DOWNCASTING
	}

}