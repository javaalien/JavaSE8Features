package com.alien.stream;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class ArrayNumberExample {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1, 7, 8, 9, 5, 2, 36, 4, 78, 222, 24, 9);

		// Exercise 1 : Given a list of numbers, return the sum of all numbers.
		sumOfAllNumbers(list);

		// Exercise 2 : Given a list of numbers, return the average of all numbers
		averageOfAllNumbers(list);

		// Exercise 3 : Given a list of numbers, square them and filter the numbers
		// which are greater 100 and then find the average of them
		getNumbersSquareAndFilterAndAverage(list);

		// Exercise 4 : Given a list of numbers, return the even and odd numbers
		// separately
		getNumbersEvenAndOddSeperately(list);

		// Exercise 5 : Given a list of numbers, find out all the numbers starting with
		// 2
		getNumbersStartingWith2(list);

		// Exercise 6 : Given a list of numbers, print the duplicate numbers
		getDuplicateNumbers(list);

		// Exercise 7 : Given a list of numbers, print the maximum and minimum values
		getMaxAndMinValueInList(list);

		// Exercise 8 : Given a list of numbers, sort them in ASC and DESC order and
		// print
		sortNumbersByASCandDESC(list);

		// Exercise 9 : Given a list of numbers, return the first 5 elements and their
		// sum
		getFirst5ElementsAndSum(list);

		// Exercise 10 : Given a list of numbers, skip first 5 numbers and return the
		// sum of remaining numbers
		getSumAfter5Numbers(list);

		// Exercise 11 : Given a list of numbers, return the cube of each number
		getCubeOfEachNumber(list);

	}

	private static void getCubeOfEachNumber(List<Integer> list) {
		List<Integer> cubeList = list.stream().map(num -> num * num * num).collect(Collectors.toList());

		System.out.println("Exercise 11 : Cubes: " + cubeList);
	}

	private static void getSumAfter5Numbers(List<Integer> list) {
		Integer sum1 = list.stream().skip(5).reduce((a, b) -> a + b).get();
		System.out.println("Exercise 10 : Sum after first 5 elements skip: " + sum1);
	}

	private static void getFirst5ElementsAndSum(List<Integer> list) {

		List<Integer> first5elements = list.stream().limit(5).collect(Collectors.toList());
		System.out.println("Exercise 9 : first5elements: " + first5elements);

		int first5elementsSum = list.stream().limit(5).mapToInt(Integer::valueOf).sum();
		System.out.println("Exercise 9 : First Way : first5elementsSum: " + first5elementsSum);

		Integer first5sum = list.stream().limit(5).reduce((a, b) -> a + b).get();
		System.out.println("Exercise 9 : Second way : first5elementsSum: " + first5sum);
	}

	private static void sortNumbersByASCandDESC(List<Integer> list) {
		List<Integer> asc_order = list.stream().sorted().collect(Collectors.toList());
		System.out.println("Exercise 8 : ASC Order: " + asc_order);

		List<Integer> desc_order = list.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
		System.out.println("Exercise 8 : DESC Order: " + desc_order);
	}

	private static void getMaxAndMinValueInList(List<Integer> list) {
		// OptionalInt max = list.stream().mapToInt(Integer::valueOf).max();
		Integer max = list.stream().max(Comparator.comparing(Integer::valueOf)).get();
		System.out.println("Exercise 7 : Maximum Value: " + max);
		// OptionalInt min = list.stream().mapToInt(Integer::valueOf).min();
		Integer min = list.stream().min(Comparator.comparing(Integer::valueOf)).get();
		System.out.println("Exercise 7 : Minimum Value: " + min);
	}

	private static void getDuplicateNumbers(List<Integer> list) {
		Set<Integer> duplicates = list.stream().filter(num -> Collections.frequency(list, num) > 1)
				.collect(Collectors.toSet());

		System.out.println("Exercise 6 : First way : duplicates: " + duplicates);

		Set<Integer> duplicates1 = new HashSet<>();

		Set<Integer> dup = list.stream().filter(num -> !duplicates1.add(num)).collect(Collectors.toSet());
		System.out.println("Exercise 6 : Second way : duplicates: " + dup);
	}

	private static void getNumbersStartingWith2(List<Integer> list) {
		List<Integer> startsWith2 = list.stream().map(num -> String.valueOf(num)).filter(num -> num.startsWith("2"))
				.map(Integer::valueOf).collect(Collectors.toList());

		System.out.println("Exercise 5 : startsWith2: " + startsWith2);
	}

	private static void getNumbersEvenAndOddSeperately(List<Integer> list) {
		List<Integer> evens = list.stream().filter(num -> num % 2 == 0).collect(Collectors.toList());

		List<Integer> odds = list.stream().filter(num -> num % 2 == 0).collect(Collectors.toList());

		System.out.println("Exercise 4 : evens: " + evens);
		System.out.println("Exercise 4 : odds: " + odds);

	}

	private static void getNumbersSquareAndFilterAndAverage(List<Integer> list) {
		double avg1 = list.stream().map(n -> n * n).filter(num -> num > 100).mapToInt(num -> num).average().orElse(0);
		System.out.println("Exercise 3 : average is: " + avg1);
	}

	private static void averageOfAllNumbers(List<Integer> list) {
		double avg = list.stream().mapToInt(a -> a).average().orElse(0);
		System.out.println("Exercise 2 : average is: " + avg);
	}

	private static void sumOfAllNumbers(List<Integer> list) {
		Optional<Integer> sum = list.stream().reduce((a, b) -> a + b);
		System.out.println("Exercise 1 : First way : sum is: " + sum.get());

		Integer sumSecondWay = list.stream().reduce(0, Integer::sum);
		System.out.println("Exercise 1 : Second way : sum is: " + sumSecondWay);
	}
}
