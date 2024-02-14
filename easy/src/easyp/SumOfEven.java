package easyp;

import java.util.Scanner;

public class SumOfEven {

	public static void main(String[] args) {
		System.out.println("Enter the Number");
		
		Scanner scan = new Scanner(System.in);

		int n=scan.nextInt();
		int sum =0;
		for(int i=2;i<=n;i+=2) {
			sum=sum+i;
			System.out.println(sum);
		}
	}

}
