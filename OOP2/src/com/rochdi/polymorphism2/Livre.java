package com.rochdi.polymorphism2;

public class Livre extends Ouvrage {

	private String auteur;
	
	public Livre(String titre, String dateDeCreation, boolean libre, String auteur) {
		super(titre, dateDeCreation, libre);
		this.auteur = auteur;
	}
	
	
	@Override
	public void afficher() {
		System.out.println("Titre de l'ouvrage : " + getTitre() +"\n"
							+ "Auteur : " + this.auteur + "\n"
							+"Date de création : "+ getDateDeCreation() + "\n"
							+"Disponible : "+ isLibre() + "\n");
	}

	
	
}
