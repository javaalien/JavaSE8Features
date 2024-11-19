package com.alien.stream;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamCollectExample {

	public static void main(String[] args) {

		Stream<String> namesStream = Stream.of("John", "Jane", "Adam", "Alice", "Bob");

		List<String> namesList = namesStream.collect(Collectors.toList());

		Set<String> namesSet = namesList.stream().filter(name -> name.startsWith("A")).collect(Collectors.toSet());

		System.out.println("Names List: " + namesList);
		System.out.println("Names Set (starting with 'A'): " + namesSet);
		
	}
}
