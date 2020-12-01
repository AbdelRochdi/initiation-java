package com.rochdi.variables;

import java.util.Scanner;
//question 1
public class hello {
	
	public static void main(String[] args) {
		System.out.println("Quel est votre prenom ?");
		Scanner sc = new Scanner(System.in);
		
		String prenom = sc.next();
		
		System.out.println("Bonjour "+ prenom);
	}

}
