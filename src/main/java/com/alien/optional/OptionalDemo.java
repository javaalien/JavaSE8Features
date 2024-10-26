package com.alien.optional;

import java.util.Optional;

public class OptionalDemo {

	public static void main(String[] args) {

		String email = "chetan@gmail.com";

		Optional<Object> emptyOptional = Optional.empty();

		System.out.println(emptyOptional);

		Optional<String> emailOptional = Optional.of(email);
		System.out.println(emailOptional);

		Optional<String> stringOptional = Optional.ofNullable(email);
		System.out.println(stringOptional);

		String value = stringOptional.get();
		System.out.println(value);

		if (stringOptional.isPresent()) {
			System.out.println(stringOptional.get());
		} else {
			System.out.println("no value present");
		}

		String defaultOptional = stringOptional.orElse("default@gmail.com");
		System.out.println(defaultOptional);

		String email2 = null;
		Optional<String> ofNullable = Optional.ofNullable(email2);
		String orElseThrow = ofNullable.orElseThrow(() -> new IllegalArgumentException("Email is Not Exist"));

		System.out.println(orElseThrow);

	}
}
