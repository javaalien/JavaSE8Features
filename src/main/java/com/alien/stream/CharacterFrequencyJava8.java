package com.alien.stream;

import java.util.Scanner;
import java.util.stream.Collectors;

// Java 8 Program to Find the Frequency of Each Character in a Given String

public class CharacterFrequencyJava8 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a string:");
		String inputString = scanner.nextLine();

		// Closing the scanner
		scanner.close();

		inputString.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(c -> c, Collectors.counting()))
				.forEach((character, frequency) -> System.out.println(character + " : " + frequency));
	}
}
