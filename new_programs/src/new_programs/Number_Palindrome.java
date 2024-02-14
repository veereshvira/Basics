package new_programs;

public class Number_Palindrome {
	public static void main(String[] args) {
		int n=12321,m=n,rev=0;
		while(n!=0) {
			int rem= n%10;
			rev= (rev*10)+rem;
			n=n/10;
		}
		System.out.println(rev);
		System.out.println((m==rev)?"Is a Palindrome":"Not a Palindrome");
	}
}
/*
Output:-
12321
Is a Palindrome
*/