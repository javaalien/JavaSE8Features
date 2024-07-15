package com.alien.stream;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;

// Java 8 Program to Find the Maximum Number and Minimum Number in a List

public class MaxMinFinder {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(2, 4, 7, 5, 9, 10, 3, 1);

		OptionalInt max = numbers.stream().mapToInt(Integer::intValue).max();

		OptionalInt min = numbers.stream().mapToInt(Integer::intValue).min();

		max.ifPresent(value -> System.out.println("Maximum Value :" + value));

		min.ifPresent(value -> System.out.println("Minimum Value :" + value));

	}
}
