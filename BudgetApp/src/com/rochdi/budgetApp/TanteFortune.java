package com.rochdi.budgetApp;

import java.util.Scanner;

public class TanteFortune {
	public static void main(String[] args) {
		
		System.out.println("Combien avez-vous recu d'argent (MAD) ?");
		
		Scanner sc = new Scanner(System.in);
		
		
		
		int input;
		
		while(!sc.hasNextInt()) {
			System.out.println("Veuillez saisir un nombre valide");
			sc.next();
		}
		
		input = sc.nextInt();
		
		int rest = input/4;
		
		int books = input - rest;
		
		int coffee = rest/3/10;
		int recharge = rest/3/10;
		int tram = rest/3/8;
		
		int flowers = ((rest/3)%coffee*10) + ((rest/3)%recharge*10) + ((rest/3)%tram*8);
		
		System.out.println("Livres et fournitures : " + books);
		System.out.println("Vous pouvez ensuite acheter :");
		System.out.println(coffee + " cafés");
		System.out.println(recharge + " cartes de recharge prépayées");
		System.out.println(tram + " billets de TRAME");
		System.out.println("Et il vous restera "+flowers+" MAD pour les roses blanches");
		
	}
}
