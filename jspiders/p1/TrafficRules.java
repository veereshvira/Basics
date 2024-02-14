package com.jspiders.p1;

public class TrafficRules {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int speed=120;
		boolean drunk=true;
		if((speed>=115 && drunk==true)||(speed>=120 && drunk==false))
		{
			System.out.println("arressted");
		}
		else
		{
			System.out.println("nothing");
		}
	}

}
