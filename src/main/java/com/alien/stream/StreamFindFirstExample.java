package com.alien.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamFindFirstExample {

	public static void main(String[] args) {

		List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "Diana", "Bob");

		Optional<String> firstBob = names.stream().filter(name -> name.equals("Bob")).findFirst();

		if (firstBob.isPresent()) {
			System.out.println("The first 'Bob' found: " + firstBob.get());
		} else {
			System.out.println("No 'Bob' found in the list.");
		}
	}

}
