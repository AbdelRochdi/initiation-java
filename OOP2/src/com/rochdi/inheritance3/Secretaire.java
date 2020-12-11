package com.rochdi.inheritance3;

public class Secretaire extends Personne {

	private int numeroBureau;
	
	private static int count;
	
	public Secretaire(String nom, String prenom, String adresse, String ville, String dateNaissance, int numeroBureau) {
		super(nom, prenom, adresse, ville, dateNaissance);
		this.numeroBureau = numeroBureau;
		count ++;
	}
	
	public void ecrirePersonne() {
		System.out.println(getNom() + " est une secretaire");
	}

	@Override
	public String toString() {
		return "Secretaire [numeroBureau=" + numeroBureau + ", toString()=" + super.toString() + "]";
	}

	public int getNumeroBureau() {
		return numeroBureau;
	}

	public void setNumeroBureau(int numeroBureau) {
		this.numeroBureau = numeroBureau;
	}

	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		Secretaire.count = count;
	}

	

	
	
}
