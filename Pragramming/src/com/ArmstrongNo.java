package com;

public class ArmstrongNo {
	public static void main(String[] args) {
		int n=9474,temp1=n,temp2=n,c=0;
		while(temp1!=0) {
			c++;
			temp1=temp1/10;
		}
		int sum=0,rem=0;
		while(temp2!=0){
			 rem = temp2%10;
			 int ans =1;
			for(int i=1;i<=c;i++) {
				ans=ans*rem;
			}
				sum=sum+ans;
				temp2=temp2/10;
			}
		System.out.println(sum);
			System.out.println(sum==n?"ArmStrong Number":"Not a ArmStrong number");
		}
	}
