package com;

public class Leapyear {

	public static void main(String[] args) {
		int x=2021;
		if(x%4==0) {
			if(x%100!=0) {
				System.out.println(x+"is leap year");
			}
			else {
				if(x%400==0) {
					System.out.println(x+"is leap year");
				}
			}
		}else {
			System.out.println(x+"is not leap year");
			}
		}
	}

