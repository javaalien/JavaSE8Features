package com.alien.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFlatMapExample {

	public static void main(String[] args) {

		List<List<String>> listOfLists = Arrays.asList(Arrays.asList("Apple", "Banana"),
				Arrays.asList("Carrot", "Daikon"), Arrays.asList("Eggplant", "Fig"));

		List<String> flatList = listOfLists.stream().flatMap(List::stream).collect(Collectors.toList());

		System.out.println("Flattened list:");
		flatList.forEach(System.out::println);

	}
}
