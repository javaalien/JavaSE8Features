package com.alien.stream;

import java.util.Arrays;
import java.util.List;

public class StreamNoneMatchExample {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "Diana");

		boolean allStartWithZ = names.stream().noneMatch(name -> name.startsWith("Z"));

		System.out.println("No names start with 'Z': " + allStartWithZ);
	}

}
