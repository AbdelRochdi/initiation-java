package com.rochdi.polymorphism;

public class Directeur extends Chef {

	private String societe;

	public Directeur(String nom, String prenom, String adresse, String ville, String date, int salaire,
			String service, String societe) {
		super(nom, prenom, adresse, ville, date, salaire, service);
		this.societe = societe;
	}

	public String getSociete() {
		return societe;
	}

	public void setSociete(String societe) {
		this.societe = societe;
	}
	
	@Override
	public void afficher() {
		System.out.println("Nom : " + getNom() + ", Prénom : "+ getPrenom() +", Adresse : "+ getAdresse() + ", Ville : "+ getVille() +", Date de Naissance: "+ getDate() + " et votre salaire est de "+ getSalaire() + " Vous êtes chef du service " + getService() + " et vous etes directeur de la société "+this.societe);
	}
	
	
	
	
}
