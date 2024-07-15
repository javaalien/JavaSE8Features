package com.alien.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

// Java 8 Program to Find the Second Largest Number in the List of Integers

public class FindSecondLargest {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 6, 7, 8);

		Optional<Integer> secondLargest = numbers.stream().distinct() 
				.sorted() 
				.skip(numbers.size() - 3) 
				.findFirst();

		secondLargest.ifPresent(s -> System.out.println("The second largest number is: " + s));
	}
}
