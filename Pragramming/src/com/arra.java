package com;

public class arra {
	public static void main(String[] args) {
		int arr[] = { 2, 4, 5, 3, 2, 3, 6, 7, 1, 8, 9 };

		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i] == arr[j]) 
					System.out.print(arr[i]);
				
//				System.out.println(arr[j]);
			}
		}
	}
}
