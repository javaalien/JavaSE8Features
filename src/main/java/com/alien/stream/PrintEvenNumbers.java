package com.alien.stream;

import java.util.Arrays;
import java.util.List;

// Java 8 Program to Print Even Numbers from a List

public class PrintEvenNumbers {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		System.out.println("Even numbers in the list:");

		numbers.stream().filter(n -> n % 2 == 0).forEach(System.out::println);

	}
}
