package com;

public class StudentResult {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char Grade = 'B';
		switch (Grade)
		{
		case'A': System.out.println("excellent");
		break;
		case'B':System.out.println("good");
		break;
		case'C': System.out.println("Just pass");
		break;
		case'D': System.out.println("fail");
		break;
		default: System.out.println("invaild grade");
		break;
		}
	}

}
