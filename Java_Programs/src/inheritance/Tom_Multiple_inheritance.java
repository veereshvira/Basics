package inheritance;

public class Tom_Multiple_inheritance {
	void disp() {
		System.out.println("tom....");
	}
}
class Jerry {
	void disp() {
		System.out.println("jerry...");
	}
}
//class Dog extends Tom,Jerry{//compile time error @ line number - 13;
//	
//	public static void main(String[] args) {
//		Dog obj = new Dog();
//		obj.msg();// Now which disp() method would be called ? 
//	}
//}

// output:-
// -Compile-time error 
// -There will be ambiguity (Or) confusion created during constructor chaining
// -ambiguity is created when super class have same variable names and methods name.

