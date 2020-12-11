package com.rochdi.polymorphism;


public class Employe extends Personne {

	private int salaire;
	
	public Employe(String nom, String prenom, String adresse, String ville, String date, int salaire) {
		super(nom, prenom, adresse, ville, date);
		this.salaire = salaire;
	}

	public int getSalaire() {
		return salaire;
	}

	public void setSalaire(int salaire) {
		this.salaire = salaire;
	}

	@Override
	public void afficher() {
		System.out.println("Nom : " + getNom() + ", Prénom : "+ getPrenom() +", Adresse : "+ getAdresse() + ", Ville : "+ getVille() +", Date de Naissance: "+ getDate() + " et votre salaire est de "+ this.salaire );
	}
	
}
