package com.alien.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

// Java 8 Program to Remove Duplicate Elements from a List

public class RemoveDuplicatesFromList {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(1, 2, 2, 3, 4, 4, 5, 5, 6);
		System.out.println("Original list: " + numbers);

		// Set<Integer> collectSet = numbers.stream().collect(Collectors.toSet());

		List<Integer> distinctNumbers = numbers.stream().distinct().collect(Collectors.toList());

		System.out.println("List after removing duplicates: " + distinctNumbers);

	}
}
