package com.rochdi.variables;

import java.util.Scanner;
//question 2
public class calculator {
	
	public static double TTC(double x) {
		return x + x*0.2;
	}
	
	public static double Remise(double x, double y) {
		return x - x*y;
	}
	
	public static void main(String[] args) {
		System.out.println("Veuillez saisir le montant :");
		
		Scanner sc = new Scanner(System.in);
		int price = sc.nextInt();
		
		System.out.println("Voulez vous une remise ?");
		
		String confirmation = sc.next();
		
		if(confirmation.equalsIgnoreCase("YES") || confirmation.equalsIgnoreCase("oui") ) {
			System.out.println("Veuillez saisir le pourcentage de la remise");
			float remise = sc.nextFloat();
//			double remise = sc.nextDouble();
			double apresRemise = Remise(price, remise);
			System.out.println("le montant final est : " + TTC(apresRemise) + "TTC et le montant de la remise est " + (int) (remise*100) +"%" );
		}else {
			System.out.println(TTC(price));
		}
		
	sc.close();
		
		
		
	}
	
}
