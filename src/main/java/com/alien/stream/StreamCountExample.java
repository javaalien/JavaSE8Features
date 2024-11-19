package com.alien.stream;

import java.util.Arrays;
import java.util.List;

public class StreamCountExample {

	public static void main(String[] args) {

		List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Eve", "Frank");

		long count = names.stream().filter(name -> name.startsWith("A")).count();

		System.out.println("Number of names starting with 'A': " + count);

	}

}
