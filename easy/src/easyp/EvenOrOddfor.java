package easyp;

import java.util.Scanner;

public class EvenOrOddfor {

	public static void main(String[] args) {
		System.out.println("Enter the number");
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
		for(int i=2;i<=n;i+=2) {
			System.out.println(i);
		}
	}

}
