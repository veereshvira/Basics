package easyp;

public class Mainclass {
public static void main(String[] args) {
	Netflix n = new Netflix();
	
	Movies m1 = new Movies("you ", n);
	Movies m2 = new Movies("me ", n);
	Movies m3 = new Movies("we ", n);
	
	m1.start();
	m2.start();
	m3.start();
}
}
