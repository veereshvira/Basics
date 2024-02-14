package com;

public class Whatsapp2018 extends Whatsapp2017{
	void notification() {
		super.notification();
		System.out.println("Blue Tick");
	}
	void media() {
		super.media();
		System.out.println("videos...Audio..Docs");
	}
	void calls() {
		super.media();
		System.out.println("Voice call");
	}
	void status() {
		System.out.println("uploaded");
	}
}
