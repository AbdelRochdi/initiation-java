package com.rochdi.constructor;



public class Constructor {	

	public static void main(String[] args) {
		
		Employe mohammed = new Employe("El Alami", "Mohammed", "Casablanca", 1963); 
		Employe khalid = new Employe("El Wahabi", "Khalid", "Safi", 1990); 
		Employe fouad = new Employe("Sbai", "Fouad", "Salé", 2006);
		
		mohammed.afficherInfoClients();
		System.out.println(mohammed.calculerAge());
		khalid.afficherInfoClients();
		System.out.println(khalid.calculerAge());
		fouad.afficherInfoClients();
		System.out.println(fouad.calculerAge());
		
	}
	
}
