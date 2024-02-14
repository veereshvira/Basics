package ex1;

public class primenumber {
	public static void main(String[] args) {
		int n=78,rem=0,i=2;
		while(i<=n/2) {
			if(n%i==0) {
				rem++;
				break;
				}
			i++;
			}
		if(rem==0) {
			System.out.println(n+"Prime no");
		}
		else
			System.out.println("not a prime");
	}
}
