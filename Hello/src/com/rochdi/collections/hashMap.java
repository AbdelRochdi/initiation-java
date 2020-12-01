package com.rochdi.collections;

import java.util.HashMap;

public class hashMap {
	public static void main(String[] args) {
		HashMap <String, Integer> test = new HashMap <String, Integer>();
		HashMap <String, Integer> test2 = new HashMap <String, Integer>();
		
		//question 18
		test.put("a", 1);
		test.put("b", 2);
		test.put("c", 3);
		
		//question 20
		test2.putAll(test);
		
		System.out.println(test);
		//question 19
		System.out.println(test.size());
		//question 21
		test2.remove("a");
		System.out.println(test2);
	}
}
