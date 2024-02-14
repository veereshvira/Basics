package Programming;

public class ExtractLastNumber {
	public static void main(String[] args) {
		int n=1239685,c=0;
		while(n!=0) {
			System.out.println(n%10);
			n=n/10;
		}
	}

}
