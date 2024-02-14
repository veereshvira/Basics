package com;

public class find_the_missing_number_in_an_array {
	public static void main(String[] args) {
		int a[]= {1,3,4,5};
		
		int sum1 = 0;
		
		for(int i=0;i<a.length;i++) {
			sum1=sum1+a[i];
		}
		int sum2=0;
		for(int j=1;j<=5;j++) {
			sum2 = sum2+j;
		}
//		int b=sum2-sum1;
		System.out.println(sum2-sum1);
	}
}
