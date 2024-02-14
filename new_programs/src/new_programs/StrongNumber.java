package new_programs;

import java.util.Scanner;

public class StrongNumber {
	public static void main(String[] args) {
		int n, i, p, r, sum = 0, num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		n = sc.nextInt();
		num = n;
		while (n != 0) {
			i = 1;
			p = 1;
			r = n % 10;
			while (i <= r) {
				p = p * i;
				i++;
			}
			sum = sum + p;
			n = n / 10;
		}
		if (sum == num) {
			System.out.println("The Entered Number Is Strong Number:");
		} else
			System.out.println("The Entered Number Is Not A Strong Number:");
	}
}
