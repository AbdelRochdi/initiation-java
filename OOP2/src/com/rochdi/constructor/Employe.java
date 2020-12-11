package com.rochdi.constructor;

import java.util.Calendar;


public class Employe {
		
		public String nom;
		public String prenom;
		public String adresse;
		public int anneeNaissance;
		
		Calendar cal = Calendar.getInstance();
		int year = cal.get(Calendar.YEAR);
		
		public int anneeEncours = year;
		
		
		
		public Employe(String nom, String prenom, String adresse, int anneeNaissance) {
			this.nom = nom;
			this.prenom = prenom;
			this.adresse = adresse;
			this.anneeNaissance = anneeNaissance;
		}
		
		public int calculerAge() {
			return this.anneeEncours - this.anneeNaissance;
		}
		
		public void afficherInfoClients() {
			System.out.println(this.nom +" "+ this.prenom+", né le "+this.anneeNaissance+" habitant à "+this.adresse );
		
	}

}
