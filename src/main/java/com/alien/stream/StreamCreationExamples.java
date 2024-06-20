package com.alien.stream;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamCreationExamples {

	public static void main(String[] args) {

		Stream<String> streamOfArray = Stream.of("a", "b", "c");
		streamOfArray.forEach(System.out::println);

		// creating from existing array or of a part of an array:
		String[] arr = new String[] { "a", "b", "c" };
		Stream<String> streamOfArrayFull = Arrays.stream(arr);
		streamOfArrayFull.forEach(System.out::println);

		Stream<String> streamOfArrayPart = Arrays.stream(arr, 1, 3);
		streamOfArrayPart.forEach(System.out::println);

	}

}
