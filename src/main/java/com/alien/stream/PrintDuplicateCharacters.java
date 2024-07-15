package com.alien.stream;

import java.util.function.Function;
import java.util.stream.Collectors;

// Java 8 Program to Print Duplicate Characters in a String

public class PrintDuplicateCharacters {

	public static void main(String[] args) {

		String input = "programming";

		input.chars().mapToObj(c -> (char) c)
			.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
			.entrySet().stream().filter(entry -> entry.getValue() > 1)
			.forEach(entry -> System.out.println("Character: " + entry.getKey() + ", Count : " + entry.getValue()));
	}
}
