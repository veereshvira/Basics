package Programming;

public class NumberPalindrome {
	public static void main(String[] args) {
		
		int n=202;
		int n1=n;
		int rev=0,rem=0;
		while(n1!=0) {
			rem=n1%10;
			rev=(rev*10)+rem;
			n1=n1/10;
		}
		if(n==rev) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("Its not Palindrome");
		}
	}
}
