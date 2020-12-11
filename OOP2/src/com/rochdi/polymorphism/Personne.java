package com.rochdi.polymorphism;



public class Personne {

	private String nom;
	private String prenom;
	private String adresse;
	private String ville;
	private String date;
	
	public Personne(String nom, String prenom, String adresse, String ville, String date) {
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.ville = ville;
		this.date = date;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
	
	public void afficher() {
		System.out.println("Nom : " + this.nom + ", Prénom : "+this.prenom+", Adresse : "+this.adresse+ ", Ville : "+ this.ville+", Date de Naissance: "+this.date );
	}
	
	
	
	
	
	
}
