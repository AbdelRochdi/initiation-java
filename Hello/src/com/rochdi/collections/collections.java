package com.rochdi.collections;

import java.util.ArrayList;
import java.util.Collections;


public class collections {
	public static void main(String[] args) {
		
		//question 1
		ArrayList <String> months = new ArrayList<String>();
		
		months.add("Janvier");
		months.add("Fevrier");
		months.add("Mars");
		months.add("Avril");
		months.add("Mai");
		months.add("Juin");
		months.add("Juillet");
		months.add("Aout");
		months.add("Septembre");
		months.add("Octobre");
		months.add("Novembre");
		months.add("Decembre");
		System.out.println(months);
		
		//question 2
		System.out.println(months.get(2));
		//question 3
		System.out.println(months.get(5));
		//question 5
		months.set(7, "Août");
		//question 6
		months.add(0, "imaginary month");

		System.out.println(months);
		//question 7
		months.remove(2);
		//question 8
		System.out.println(months.indexOf("Juin"));
		System.out.println(months.contains("Juillet"));
		//question 9
		Collections.sort(months);
		
		//question 4
		for(String month : months) {
			System.out.println(month);
		}
		
		ArrayList<String> copiedMonths = new ArrayList <String>();
		ArrayList <String> clonedMonths = new ArrayList<String>();
		
		//question 10
		copiedMonths.addAll(months);
		//question 11
		clonedMonths = (ArrayList)months.clone(); 
		
		System.out.println(copiedMonths);
		System.out.println(clonedMonths);
		//question 12
		System.out.println(clonedMonths.isEmpty());
		
	}
}
