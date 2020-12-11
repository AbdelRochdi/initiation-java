package com.rochdi.inheritance3;

public class Inheritance3 {
	
	public static void main(String[] args) {
		Secretaire loubna = new Secretaire("El Asri", "Loubna", "1 rue zohor", "Youssoufiya", "01-06-1994", 3);
		Secretaire loubna2 = new Secretaire("Draissi", "Loubna", "1 rue zohor", "Youssoufiya", "01-06-1994", 3);
		Secretaire loubna3 = new Secretaire("Draissi", "Loubna", "1 rue zohor", "Youssoufiya", "01-06-1994", 3);
		
		Enseignant bouchra = new Enseignant("Marzak", "Bouchra", "1 rue unknown", "Youssoufiya", "01-01-1993", "Java JEE");
		Enseignant ilyass = new Enseignant("Khairi", "Ilyass", "1 rue unknown", "Youssoufiya", "01-01-1990", "C#");
		
		
		Etudiant yassin = new Etudiant("Makhlouk", "Yassin", "1 rue je sais pas", "Casablanca", "10-12-1995", "Java JEE");
		Etudiant yassin2 = new Etudiant("Moumen", "Yassin", "1 rue je sais pas", "Youssoufiya", "10-12-1995", "Java JEE");
		Etudiant yassin3 = new Etudiant("Moumen", "Yassin", "1 rue je sais pas", "Youssoufiya", "10-12-1995", "Java JEE");
		Etudiant yassin4 = new Etudiant("Moumen", "Yassin", "1 rue je sais pas", "Youssoufiya", "10-12-1995", "Java JEE");
		
		System.out.println(Secretaire.getCount());
		System.out.println(Enseignant.getCount());
		System.out.println(Etudiant.getCount());
		System.out.println(loubna.toString());
		System.out.println(bouchra.toString());
		System.out.println(yassin.toString());
		
		yassin3.ecrirePersonne();
		yassin4.modifierPersonne("2 rue modified", "ville modified");
		System.out.println(yassin4.toString());
		
		
	}

}
