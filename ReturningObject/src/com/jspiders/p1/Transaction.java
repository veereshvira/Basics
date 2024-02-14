package com.jspiders.p1;
//To perform account related transaction
public class Transaction 
{
	void viewAccountBalance(Account a1) {
		System.out.println("Account Balance :"+a1.getAccBal());
	}
	
	void deposit(Account a1, double amount) {
		System.out.println("Depositing Rs "+amount);
		a1.setAccBal(a1.getAccBal()+amount);
	}
	void withdraw(Account a1, double amount) {
		System.out.println("withdrawing Rs "+amount);
		if(amount < a1.getAccBal()) {
			a1.setAccBal(a1.getAccBal()- amount);
			System.out.println("Withdraw success");
		}
		else {
			System.out.println("Withdraw Failed due to insuffient balance");
		}
	}
}
