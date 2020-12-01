package com.rochdi.collections;

import java.util.HashSet;
import java.util.Iterator;

public class hashSet {
	public static void main(String[] args) {
		
		//question 13
		HashSet<String> months = new HashSet<String>();
		
		months.add("Janvier");
		months.add("Fevrier");
		months.add("Mars");
		months.add("Avril");
		months.add("Mai");
		months.add("Juin");
		months.add("Juillet");
		months.add("Août");
		months.add("Septembre");
		months.add("Octobre");
		months.add("Novembre");
		months.add("Décembre");
		
		System.out.println(months);
		//question 15
		System.out.println(months.size());
		
		//question 14
		Iterator <String> it = months.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		//question 16
		months.clear();
		System.out.println(months);
		//question 17
		System.out.println(months.isEmpty());
		
		for (String month : months) {
			System.out.println(month);
		}
		
	
	}
}
