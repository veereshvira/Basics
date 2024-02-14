package com.singleton;

public class AddhaarCard {

	private static AddhaarCard obj;
	
	private AddhaarCard() {
		System.out.println("AddhaarCard Generated");
	}
	
	public static AddhaarCard getAddhaar() {
		if(obj==null) {
			obj= new AddhaarCard();
		}
		return obj;
	}
}
