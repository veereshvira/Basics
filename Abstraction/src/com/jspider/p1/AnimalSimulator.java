package com.jspider.p1;

public class AnimalSimulator {
//Generalized making noise of any type of animal
	void makenoise(Animal arg) {
		arg.noise();
	}
//specialized making noise of only Dog type
void makeNsoise (Dog arg)
{
	arg.noise();
}
}