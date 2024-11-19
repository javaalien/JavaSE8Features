package com.alien.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDistinctExample {

	public static void main(String[] args) {
		List<String> items = Arrays.asList("apple", "apple", "banana", "apple", "orange", "banana", "papaya");

		List<String> distinctItems = items.stream().distinct().collect(Collectors.toList());

		System.out.println("Distinct items:");
		distinctItems.forEach(System.out::println);

	}
}
