package comparable;

import java.util.Scanner;

public class Atm {
	public static void main(String[] args) {
		int balance = 5000;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Amount to be Withdrawn");
		int amount = sc.nextInt();
		if (amount <=balance) {
			System.out.println("Amount Withdrawal succesful");
		} else {
			try {
				throw new InsufficentBalanceException("Insufficent balance");
			} catch (Exception e) {
			System.out.println(e.getMessage());
			}

		}
	}
}
