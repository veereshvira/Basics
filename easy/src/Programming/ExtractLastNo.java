package Programming;

public class ExtractLastNo {
	public static void main(String[] args) {
		int n=938493,c=0,rem=0;
		while(n!=0) {
			rem=n%10;
			System.out.println(rem);
			n=n/10;
		}
	}
}
