package easyp;

public class LeapYear {
	public static void main(String[] args) {
		int year=100;
		if(year%4==0 && year%100==0 && year%400==0) {
			System.out.println(year+" Is a Leap Year");
		}
		else {
			System.out.println(year +" Is Not a Leap Year");
		}
	}
}
