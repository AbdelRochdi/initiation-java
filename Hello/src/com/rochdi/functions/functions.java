package com.rochdi.functions;

public class functions {
	
	//function that returns true question 1
	public static boolean retrue() {
		return true;
	}
	
	//function that returns the same string we gave to it question 2 
	public static String reString(String x) {
		return x;
	}
	
	//function that concats two strings question 3
	public static String reConcat(String x, String y) {
		
		return x+y;
	}
	
	//function that compares two integers question 4
		public static String reCompare(int x, int y) {
			if(x > y) 
			{
				return	"Le premier nombre est plus grand";
			}
			else if(x < y) 
			{
				return "Le premier nombre est plus petit";			
			}
			else 
			{
				return "Les deux nombres sont identiques ";
			}
		}
	
	//function that concats an int and a string question 5
	public static String reConcatMultiple(int x, String y) {
		return x+y;
	}
	
	//function that says hello question 6
	public static String hello(String nom, String prenom,int age ) {
		return "Bonjour " + nom +" "+ prenom + ", tu as " + age + "ans";
	}
	
	
	
	//functions that checks gender and age question 7
	public static String genAge(String gender, int age) {
		if(gender.equalsIgnoreCase("homme"))
		{
			if(age > 18) 
			{
				return "Vous êtes un homme et vous êtes majeur";
			}
			else 
			{
				return "Vous êtes un homme et vous êtes mineur";
			}
		}
		else if(gender.equalsIgnoreCase("homme"))
		{
			if(age > 18) 
			{
				return "Vous êtes une femme et vous êtes majeur";
			}
			else 
			{
				return "Vous êtes une femme et vous êtes mineur";
			}
		}else
		{
			return " ";
		}
		
	}
	
	//function that sums three integers with a default value question 8
	public static int sumDef(int x, int y, int z ) {
		return x + y + z;
	}
	public static int sumDef(int x, int y) {
		return sumDef(x,y,3);
	}
	public static int sumDef(int x) {
		return sumDef(x,2);
	}
	public static int sumDef() {
		return sumDef(1);
	}
	
	
	public static void main(String[] args) {
		System.out.println(retrue());
		System.out.println(reString("same string you gave me"));
		System.out.println(reConcat("first", "last"));
		System.out.println(reConcatMultiple(1, "last"));
		System.out.println(reCompare(2,2));
		System.out.println(hello("Rochdi","Abdelghafour",23));
		System.out.println(genAge("homme",23));
		System.out.println(sumDef());
		

	}
}
