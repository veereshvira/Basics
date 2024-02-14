package easyp;

import java.util.Scanner;

public class EvenOrOdd {
	public static void main(String[] args) {
		System.out.println("Enter the Number");
		Scanner scan = new Scanner(System.in);
		int a=scan.nextInt();
		if(a%2==0) {
			System.out.println(a+" is a Even number");
		}
		else {
			System.out.println(a+" is a Odd number");
		}
	}
}
