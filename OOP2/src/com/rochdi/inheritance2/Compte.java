package com.rochdi.inheritance2;

public class Compte {

	private long numDeCompte;
	private double solde;
	
	public Compte(long numDeCompte, double solde) {
		this.numDeCompte = numDeCompte;
		this.solde = solde;
	}
	
	public long getNumDeCompte() {
		return numDeCompte;
	}

	public void setNumDeCompte(long numDeCompte) {
		this.numDeCompte = numDeCompte;
	}

	public double getSolde() {
		return solde;
	}

	public void setSolde(double solde) {
		this.solde = solde;
	}

	public void ajouter(double montant) {
		this.solde += montant;
	}
	
	public void retirer(double montant) {
		if(this.solde < montant) {
			System.out.println("Solde insuffisant");
			return ;
		}
		this.solde -= montant;
	}
	
	public void afficher() {
		System.out.println("Votre numéro de compte est " + getNumDeCompte() + " et votre solde est " + getSolde());
	}
	
	
}
