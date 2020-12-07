package com.rochdi.oop;

public class Main {

	public static void main(String[] args) {
		
		Dog rex = new Dog("Rex");
		Dog max = new Dog("Max");
		
		rex.aboyer("bark.wav");
		rex.manger();
		rex.aboyer2("mad");
		rex.manger2("de la viande");
		
		max.aboyer("bark.wav");
		max.manger();
		max.aboyer2("cool");
		max.manger2("du poisson");
		
		
		
		
	}
	
}
