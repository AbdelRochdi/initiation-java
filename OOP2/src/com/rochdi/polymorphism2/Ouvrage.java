package com.rochdi.polymorphism2;

public class Ouvrage {
	
	private String titre;
	private String dateDeCreation;
	private boolean libre;
	
	public Ouvrage(String titre, String dateDeCreation, boolean libre) {
		this.titre = titre;
		this.dateDeCreation = dateDeCreation;
		this.libre = libre;
	}
	
	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getDateDeCreation() {
		return dateDeCreation;
	}

	public void setDateDeCreation(String dateDeCreation) {
		this.dateDeCreation = dateDeCreation;
	}

	public boolean isLibre() {
		return libre;
	}

	public void setLibre(boolean libre) {
		this.libre = libre;
	}

	public void afficher() {
		System.out.println("Titre de l'ouvrage : " + this.titre +"\n"
							+"Date de création : "+ this.dateDeCreation + "\n"
							+"Disponible : "+this.libre);
	}
	
}
