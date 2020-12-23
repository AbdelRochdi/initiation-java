package com.rochdi.lsv;

import java.util.ArrayList;

public class Facts {

	private static ArrayList<String> factsText = new ArrayList<String>();
	private static ArrayList<String> factsImage = new ArrayList<String>();

	public static void addFact(String text, String image) {
		factsText.add(text);
		factsImage.add(image);
	}

	public static String[] getRandomFact(int random) {
		

		String fact[] = { factsText.get(random), factsImage.get(random) };
		return fact;
	}

	

	public static ArrayList<String> getFactsText() {
		return factsText;
	}

	public static void setFactsText(ArrayList<String> factsText) {
		Facts.factsText = factsText;
	}

	public static ArrayList<String> getFactsImage() {
		return factsImage;
	}

	public static void setFactsImage(ArrayList<String> factsImage) {
		Facts.factsImage = factsImage;
	}

}
