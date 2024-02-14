package com.jspiders.p1;

	public class AccountTransfer {
		void transfer(Account a2,Account a3,double amount)
		{
			System.out.println("enter the account num: "+a3.getAccNum());
			System.out.println("Account name: "+a3.getCustName());
			System.out.println("enter the amount: "+amount);
			if(amount<a2.getAccBal())
			{
				a2.setAccBal(a2.getAccBal()-amount);
				System.out.println("transfer succesfull");
			}
			else {
				System.out.println("Transfer failed due to insufficient balance");
				
			}
			a3.setAccBal(a3.getAccBal()+amount);
		}

	}

