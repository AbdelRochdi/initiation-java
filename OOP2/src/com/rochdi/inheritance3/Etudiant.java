package com.rochdi.inheritance3;

public class Etudiant extends Personne{

	private String diplome;
	
	public static int count;

	public Etudiant(String nom, String prenom, String adresse, String ville, String dateNaissance, String diplome) {
		super(nom, prenom, adresse, ville, dateNaissance);
		this.diplome = diplome;
		count ++;
	}
	
	public void ecrirePersonne() {
		System.out.println(getNom() + " est un étudiant");
	}

	@Override
	public String toString() {
		return "Etudiant [diplome=" + diplome + ", toString()=" + super.toString() + "]";
	}

	public String getDiplome() {
		return diplome;
	}

	public void setDiplome(String diplome) {
		this.diplome = diplome;
	}

	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		Etudiant.count = count;
	}
	
	
	
	
	
	
	
}
