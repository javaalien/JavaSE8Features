package com.alien.stream;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

//  Java 8 Program To Count Characters in a String

public class CharacterCount {

	public static void main(String[] args) {

		String input = "Hello Alien";

		Map<Character, Long> characterCount = input.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		System.out.println("Character counts:");

		characterCount.forEach((character, count) -> System.out.println(character + " : " + count));

	}
}
