package com;

public class Whatsapp2017 extends Whatsapp2016{
	void notification() {
		super.notification();
		System.out.println("Double Tick");
	}
	void media() {
		super.media();
		System.out.println("Pics");
	}
	void calls() {
		System.out.println("Voice call");
	}
}
