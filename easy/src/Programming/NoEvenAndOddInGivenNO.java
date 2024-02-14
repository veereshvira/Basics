package Programming;

public class NoEvenAndOddInGivenNO {
	public static void main(String[] args) {
		int n=3456789,c=0,rem=0,e=0,o=0;
		while(n!=0) {
			rem=n%10;
			if(rem%2==0) {
				e++;
			}
			else {
				o++;
			}
			n=n/10;
		}
		System.out.println("count of even "+e);
		System.out.println("count of odd  "+o);
	}

}
