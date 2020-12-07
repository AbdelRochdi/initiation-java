package com.rochdi.oop2;

public class Main {

	public static void main(String[] args) {
		Account hassan = new Account("El Alami Hassan", "Safi", 14765.80);
		Account khalid = new Account("Karimi Khalid", "Casablance", 7654.00);
		
		hassan.afficherInfosCompte();
		khalid.afficherInfosCompte();
		
		System.out.println(hassan.calculerInteret(0.07));
		System.out.println(khalid.calculerInteret(0.07));
		
		System.out.println(khalid.getNom());
		System.out.println(khalid.getAdresse());
		System.out.println(khalid.getSolde());
		
		khalid.retirer(80);
		
	}
	
}
