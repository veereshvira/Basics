package ex1;

public class adhaarnum{
	final long num;
	String name;


	adhaarnum(String name,long num) {
		this.name = name;
		this.num=num;

	}


	public static void main(String[] args) {
		adhaarnum a = new adhaarnum("veeresh",822928838399l);
		System.out.println(a.name);
		System.out.println(a.num);
	}
}
