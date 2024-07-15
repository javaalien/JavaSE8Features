package com.alien.stream;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

// Java 8 Program to Convert List to Map Using Stream API

public class ListToMapExample {

	public static void main(String[] args) {

		List<String> items = List.of("apple", "banana", "cherry");

		Map<String, Integer> itemMap = items.stream().collect(Collectors.toMap(item -> item, item -> item.length()));

		System.out.println("List to Map:");

		itemMap.forEach((key, value) -> {
			System.out.println(key + " : " + value);
		});
	}
}
