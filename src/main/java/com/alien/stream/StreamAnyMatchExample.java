package com.alien.stream;

import java.util.Arrays;
import java.util.List;

public class StreamAnyMatchExample {

	public static void main(String[] args) {

		List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "Diana");

		boolean hasD = names.stream().anyMatch(name -> name.startsWith("D"));

		System.out.println("Is there any name that starts with 'D'? " + hasD);

	}
}
