package com.rochdi.inheritance2;

public class Inheritance2 {
	
	public static void main(String[] args) {
		
		Epargne khalid = new Epargne(123456789, 100);
		
		Courant mohammed = new Courant(987654321, 6000);
		
		khalid.afficher();
		mohammed.afficher();
		
	}
	
}
