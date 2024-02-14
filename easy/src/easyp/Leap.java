package easyp;

public class Leap {
	public static void main(String[] args) {
		int year=100;
		if(year%4==0) {
			if(year%100!=0) {
				System.out.println("Leap Year");
			}
			else{
				if(year%400==0){
					System.out.println("Leap Year");
				}
				else {
					System.out.println("Not a leap Year");
				}
			}
		}
		else {
			System.out.println("Not a leap Year");
		}
	}


}
