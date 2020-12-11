package com.rochdi.polymorphism2;

public class Video extends Ouvrage {
	
	private String editeur;
	private double duree;

	public Video(String titre, String dateDeCreation, boolean libre, String editeur, double duree) {
		super(titre, dateDeCreation, libre);
		// TODO Auto-generated constructor stub
		this.editeur = editeur;
		this.duree = duree;
	}
	
	@Override
	public void afficher() {
		System.out.println("Titre de l'ouvrage : " + getTitre() +"\n"
							+ "Auteur : " + this.editeur + "\n"
							+ "Durée : " + this.duree + "\n"
							+"Date de création : "+ getDateDeCreation() + "\n"
							+"Disponible : "+ isLibre() + "\n");
	}
	
	

	
	
}
