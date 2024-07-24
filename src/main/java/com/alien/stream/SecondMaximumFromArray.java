package com.alien.stream;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

// Convert List of string to Integer

public class SecondMaximumFromArray {

	public static void main(String[] args) {

		Integer[] arr = { 1, 2, 3, 4, 5 };

		List<Integer> list = Arrays.asList(arr);

		Integer Secmax = list.stream().sorted(Collections.reverseOrder()).skip(1).findFirst().get();

		System.out.println(Secmax);

	}
}
