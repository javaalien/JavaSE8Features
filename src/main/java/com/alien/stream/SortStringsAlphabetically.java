package com.alien.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// Java 8 Program to Sort List of Strings Alphabetically

public class SortStringsAlphabetically {

	public static void main(String[] args) {

		List<String> strings = Arrays.asList("Banana", "Apple", "Orange", "Mango", "Grape");

		List<String> collect = strings.stream().sorted().collect(Collectors.toList());

		System.out.println("Sorted list of strings:");
		collect.forEach(System.out::println);

	}
}
