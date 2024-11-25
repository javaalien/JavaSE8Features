package com.alien.stream;

import java.util.Arrays;
import java.util.stream.Stream;

// How to convert a Java 8 Stream to an Array?

public class StreamToArray {

	public static void main(String[] args) {

		Stream<String> stringStream = Stream.of("a", "b", "c");

		String[] stringArray = stringStream.toArray(size -> new String[size]);

		Arrays.stream(stringArray).forEach(System.out::println);
	}
}
