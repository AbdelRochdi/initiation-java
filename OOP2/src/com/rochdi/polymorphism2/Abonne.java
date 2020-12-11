package com.rochdi.polymorphism2;

public class Abonne {
	
	private int numeroIdentite;
	private int numeroAbonnement;
	private String nom;
	private String ouvragePris;
	
	public Abonne(int numeroIdentite, int numeroAbonnement, String nom, String ouvragePris) {
		this.numeroIdentite = numeroIdentite;
		this.numeroAbonnement = numeroAbonnement;
		this.nom = nom;
		this.ouvragePris = ouvragePris;
	}
	
	public void afficher() {
		System.out.println("Numéro d'identité : " + this.numeroIdentite + "\n"
							+ "Numéro d'abonnement : " + this.numeroAbonnement + "\n"
							+ "Nom : "+this.nom + "\n"
							+ "Ouvrage pris : "+ this.ouvragePris);
	}

	public int getNumeroIdentite() {
		return numeroIdentite;
	}

	public void setNumeroIdentite(int numeroIdentite) {
		this.numeroIdentite = numeroIdentite;
	}

	public int getNumeroAbonnement() {
		return numeroAbonnement;
	}

	public void setNumeroAbonnement(int numeroAbonnement) {
		this.numeroAbonnement = numeroAbonnement;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getOuvragePris() {
		return ouvragePris;
	}

	public void setOuvragePris(String ouvragePris) {
		this.ouvragePris = ouvragePris;
	}
	
	
	
	
	

}
