package Programming;

import java.util.Scanner;

public class Powernumb {
	public static void main(String[] args) {
		System.out.println("enter the number");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int p= scan.nextInt();
		int sum=0,rem=0;
		while(n!=0) {
			rem=n%10;
			int ans =1;
			for(int i=1;i<=p;i++) {
				ans=ans*rem;
			}
			sum=sum+ans;
			n=n/10;
		}
		System.out.println(sum);
	}
}
