package com.alien.stream;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

//How to find only duplicate elements with its count from the String ArrayList in Java8?

public class DuplicateElementsWithItsCount {

	public static void main(String[] args) {

		List<String> names = Arrays.asList("AA", "BB", "AA", "CC");

		Map<String, Long> namesCount = names.stream().filter(x -> Collections.frequency(names, x) > 1)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		System.out.println(namesCount);

	}
}
