package new_programs;

public class Prog_11_ArmStrong_Number {
	public static void main(String[] args) {
		int n=9474;
		int temp1=n;
		int temp2=n;
		int c=0;
		while(temp1!=0) {
			c++;
			temp1=temp1/10;
		}
		int sum=0,rem=0;
		while(temp2!=0) {
			rem=temp2%10;
			int ans=1;
			for(int i=1;i<=c;i++) {
				ans=ans*rem;
			}
			sum=sum+ans;
			temp2=temp2/10;
		}
		System.out.println(sum);
		if(sum==n) {
			System.out.println("Armstrong No.");
		}
		else {
			System.out.println("Not a ArmStrong No.");
		}
	}
}
