package com.rochdi.polymorphism;

public class Chef extends Employe {
	
	private String service;

	public Chef(String nom, String prenom, String adresse, String ville, String date, int salaire, String service) {
		super(nom, prenom, adresse, ville, date, salaire);
		
		this.service = service;
	}

	public String getService() {
		return service;
	}

	public void setService(String service) {
		this.service = service;
	}

	@Override
	public void afficher() {
		System.out.println("Nom : " + getNom() + ", Prénom : "+ getPrenom() +", Adresse : "+ getAdresse() + ", Ville : "+ getVille() +", Date de Naissance: "+ getDate() + " et votre salaire est de "+ getSalaire() + " Vous êtes chef du service " + this.service );
	}
}
