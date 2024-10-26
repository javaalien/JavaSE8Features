package com.alien.optional;

import java.util.Optional;

public class OptionalFilterMapExample {

	public static void main(String[] args) {

		Optional<String> optionalValue = Optional.of("Hello Java Alien");

		Optional<String> result = optionalValue.filter((s) -> s.contains("Alien"));

		Optional<String> upperString = result.map(String::toUpperCase);

		System.out.println("Filtered Result: " + result.orElse("No Match"));

		System.out.println("Mapped Result :" + upperString.orElse("No Transformations Applied"));

	}
}
