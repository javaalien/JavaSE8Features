package com.alien.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

// Java 8 Program to Find the Second Largest Number in the List of Integers

public class SecondLargestNumber {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(1, 3, 4, 5, 6, 6, 7, 2);

		Optional<Integer> secondNumber = numbers.stream()
									.distinct()
									.sorted(Comparator.reverseOrder())
									.skip(1)
									.findFirst();

		secondNumber.ifPresent(number -> System.out.println("Second Largest Number: " + number));

	}
}
