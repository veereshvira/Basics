package com.jspiders.p1;
//creating an account
public class AccountCreation {
	static int randNum=20001001;
	Account createAccount(String custName,double accBal) {
		System.out.println("Creating an Account......");
		return new Account(randNum++,custName, accBal);
	}
}
