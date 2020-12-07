package com.rochdi.oop2;

public class Account {
	
	private String nom;
	private String adresse;
	private double solde;

	public Account(String nom, String adresse, double solde) {
		this.nom = nom;
		this.adresse = adresse;
		this.solde = solde;
	}
	
	public void afficherInfosCompte() {
		System.out.println(this.nom + " habite à (" + this.adresse + ") - infos solde " + this.solde + " DH");
	}
	
	public double calculerInteret(double tauxInteret) {
		
		return this.solde + (this.solde*tauxInteret);
		
	}
	
	public void retirer(double m) {
		if (m > this.solde) {
			System.out.println("Solde insuffisant");
		}else {
			this.solde -= m;
			System.out.println("Operation effectuée, vous avez retiré " +m+ " DH, votre solde actuel est de "+ this.solde +" DH");
		}
	}
	
	public String getNom() {
		return this.nom;
	}
	public void setNom(String nom) {
	 this.nom = nom;
	}
	public String getAdresse() {
		return this.adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public double getSolde() {
		return this.solde;
	}
	public void setSolde(double solde) {
		this.solde = solde;
	}
	
}
