package com.rochdi.inheritance2;

import java.util.Calendar;

public class Epargne extends Compte {

	private double interet = 0.02;
	Calendar cal = Calendar.getInstance();
	private int month = cal.get(Calendar.MONTH)+1;
	
	public double getInteret() {
		return interet;
	}

	public void setInteret(double interet) {
		this.interet = interet;
	}


	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}



	public Epargne(long numDeCompte, double solde) {
		super(numDeCompte, solde);
		if (solde < 200) {
			System.out.println("Veuillez verser un minimum de 200DH");
		}
	}
	
	
	
	public double calculerInteret() {
		return getSolde()*(this.interet/12)*this.month;
	}
	
	@Override
	public void afficher() {
		System.out.println("Votre numéro de compte est "+getNumDeCompte()+", votre solde est "+getSolde()+" et votre interet est "+calculerInteret());
	}
	
	
}
