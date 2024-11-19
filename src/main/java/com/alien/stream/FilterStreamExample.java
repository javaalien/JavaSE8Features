package com.alien.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterStreamExample {

	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {

		List<String> lines = Arrays.asList("java", "c", "python");

		List<String> result = lines.stream().filter(line -> !"c".equals(lines)).collect(Collectors.toList());

		result.forEach(System.out::println);

	}
}
