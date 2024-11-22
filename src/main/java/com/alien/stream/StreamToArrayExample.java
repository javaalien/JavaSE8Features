package com.alien.stream;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamToArrayExample {

	public static void main(String[] args) {

		Stream<String> stream = Stream.of("Java", "Python", "JavaScript", "Ruby");

		String[] array = stream.toArray(String[]::new);

		System.out.println("Array from Stream: " + Arrays.toString(array));

	}
}