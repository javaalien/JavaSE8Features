package com.alien.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamFindAnyExample {

	public static void main(String[] args) {

		List<String> fruits = Arrays.asList("apple", "banana", "cherry", "date", "elderberry");

		Optional<String> anyFruit = fruits.stream().filter(fr -> fr.startsWith("b")).findAny();

		if (anyFruit.isPresent()) {
			System.out.println(" Found a fruit starting with 'b': " + anyFruit.get());
		} else {
			System.out.println("No fruit found starting with 'b'.");
		}

	}

}
