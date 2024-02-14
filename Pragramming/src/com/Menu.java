package com;
import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		while(true) {
			System.out.println("====CALI====");
			System.out.println("1.ADD\n2.SUB\n3.DIV\n4.MUL\n5.MOD\n6.EXIT");
			System.out.println("=====ENTER YOUR OPTION===");
			int op=s1.nextInt();
			if(op==6)
				System.out.println("=====enter n1=====");
			int n1=s1.nextInt();
			System.out.println("=====enter n2=====");
			int n2=s1.nextInt();
			switch(op){
			case 1:
				System.out.println("ADD:"+(n1+n2));
				break;
			case 2:
				System.out.println("SUB:"+(n1-n2));
				break;
			case 3:
				System.out.println("DIV:"+(n1/n2));
				break;
			case 4:
				System.out.println("MUL:"+(n1*n2));
				break;
			case 5:
				System.out.println("MOD:"+(n1%n2));
				break;
			default:
				System.out.println("invalid option");


			}

		}
	}}
