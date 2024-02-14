package new_programs;

public class Prog_10_Reverse_a_number {
	public static void main(String[] args) {
		int n=1231, rev=0;
		while(n!=0) {
			int rem=n%10;
			rev=(rev*10)+rem;
			n=n/10;
		}
		System.out.println(rev);
	}
}
