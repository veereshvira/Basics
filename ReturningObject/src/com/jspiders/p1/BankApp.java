package com.jspiders.p1;

public class BankApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccountCreation acc = new AccountCreation();
		
		Account acc1 = acc.createAccount("Ramesh",20000.00);
		Account acc2= acc.createAccount("Suresh",30000.00);
		acc1.details();
		acc2.details();
		Transaction tx1=new Transaction();
		tx1.viewAccountBalance(acc1);
	
		tx1.viewAccountBalance(acc1);
		
		System.out.println("==================");
		
		AccountTransfer at1=new AccountTransfer();
		at1.transfer(acc1,acc2,2000.00 );
		tx1.viewAccountBalance(acc1);
		tx1.viewAccountBalance(acc2);
	}

}
