package com.alien.lambada;

import java.util.HashMap;
import java.util.Map;

// Java 8 forEach() method with the Map Example

public class ForEachWithMap {

	public static void main(String[] args) {

		final Map<Integer, String> map = new HashMap<>();
		map.put(1, "kavya");
		map.put(2, "Rudra");
		map.put(3, "Prakash");
		map.put(4, "Amir");
		map.put(5, "chetan");

		System.out.println("Loop a Map using a for-each loop.");
		for (Map.Entry<Integer, String> entry : map.entrySet()) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
		System.out.println("Loop a Map with forEach and lambda expressions.");

		map.forEach((k, v) -> {
			System.out.println(k + ":" + v);
		});
	}
}
