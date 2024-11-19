package com.alien.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMapExample {

	public static void main(String[] args) {

		List<String> words = Arrays.asList("hello", "world", "stream", "java");

		List<String> upperCaseWords = words.stream().map(String::toUpperCase).collect(Collectors.toList());

		System.out.println("Transformed words:");

		upperCaseWords.forEach(System.out::println);
		
	}
}
