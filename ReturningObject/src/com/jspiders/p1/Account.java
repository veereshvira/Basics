package com.jspiders.p1;

public class Account {
	int accNum;
	String custName;
	double accBal;
	public Account(int accNum, String custName, double accBal) {
		super();
		this.accNum = accNum;
		this.custName = custName;
		this.accBal = accBal;
	}
	public int getAccNum() {
		return accNum;
	}
	public void setAccNum(int accNum) {
		this.accNum = accNum;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public double getAccBal() {
		return accBal;
	}
	public void setAccBal(double accBal) {
		this.accBal = accBal;
	}
	
	void details()
	{
		System.out.println("Account Number is:"+accNum+"Account Balance:"
										+accBal+"Custom Name: "+custName);
	}
}
