package com.rochdi.inheritance;

public class ArticleEnSolde extends Article {
	
	private double remise;
	
	public ArticleEnSolde(String nom, double prix, double remise ) {
		super(nom, prix);
		this.remise = remise;
	}
	
	
	
	public double getRemise() {
		return remise;
	}



	public void setRemise(double remise) {
		this.remise = remise;
	}



	@Override
	public void afficher() {
		System.out.println("le prix est "+getPrix() + " et le poucentage de la remise est " +getRemise());
	}
	
	
}
