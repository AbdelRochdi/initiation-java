package com.rochdi.polymorphism;



public class Polymorphism1 {
		
	public static void main(String[] args) {
		
		Employe khalid = new Employe("El Alami", "Khalid", "1 rue Salé", "Casablanca", "1996-12-01", 6000);
		Employe mehdi = new Employe("El Alaoui", "Mehdi", "1 rue Salé", "Casablanca", "1996-12-01", 6000);
		Employe hamza = new Employe("Kassir", "Hamza", "1 rue Salé", "Youssoufiya", "1996-12-01", 6000);
		Employe otmane = new Employe("Eddeghoughi", "Otmane", "1 rue Salé", "Casablanca", "1996-12-01", 6000);
		Employe yassin = new Employe("Makhlouk", "Yassin", "1 rue Salé", "Casablanca", "1996-12-01", 6000);
		Chef imad = new Chef("Rqioui", "Imad", "1 rue california", "Settat", "1990-06-02", 10000, "Commercial");
		Chef bouchra = new Chef("Marzak", "Bouchra", "1 rue california", "Settat", "1990-06-02", 10000, "Commercial");
		Directeur adil = new Directeur("Bouanani", "Adil", "10 rue Venezia", "New York", "1980-05-26", 20000 , "Planification", "Hexagon");
		
		
		Personne[] personne = {khalid, mehdi, hamza, otmane, yassin, imad, bouchra, adil};
		
		for (int i = 0; i < personne.length; i++) {
			personne[i].afficher();
		}
		
		
//		SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd");
//		
//		try {
//			Date t = ft.parse("1996-12-01");
//			System.out.println(t);
//		} catch (ParseException e) {
//			e.printStackTrace();
//		}
		
		
	}
	
}
