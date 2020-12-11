package com.rochdi.inheritance3;

public class Enseignant extends Personne {

	private String specialite;
	
	private static int count;

	public Enseignant(String nom, String prenom, String adresse, String ville, String dateNaissance, String specialite) {
		super(nom, prenom, adresse, ville, dateNaissance);
		this.specialite = specialite;
		count ++;
	}
	
	public void ecrirePersonne() {
		System.out.println(getNom() + " est un enseignant");
	}

	

	@Override
	public String toString() {
		return "Enseignant [specialite=" + specialite + ", toString()=" + super.toString() + "]";
	}

	public String getSpecialite() {
		return specialite;
	}

	public void setSpecialite(String specialite) {
		this.specialite = specialite;
	}

	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		Enseignant.count = count;
	}
	
	
	
	
	
	
}
