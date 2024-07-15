package com.alien.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// Java 8 Program to Concatenate Two Streams

public class ConcatenateStreams {

	public static void main(String[] args) {

		Stream<String> stream1 = Stream.of("Java", "Python", "C++");
		Stream<String> stream2 = Stream.of("JavaScript", "TypeScript", "Kotlin");

		// Step 2: Concatenating the two streams
		Stream<String> concatenatedStream = Stream.concat(stream1, stream2);

		// Step 3: Collecting the concatenated stream into a list
		List<String> resultList = concatenatedStream.collect(Collectors.toList());

		// Step 4: Displaying the result
		System.out.println("Concatenated Stream Result: " + resultList);
	}
}
