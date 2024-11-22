package com.alien.stream;

import java.util.Arrays;
import java.util.List;

public class StreamForEachExample {

	public static void main(String[] args) {

		List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "Diana");

		System.out.println("Names in the list:");

		names.stream().forEach(name -> System.out.println(name));

	}
}
