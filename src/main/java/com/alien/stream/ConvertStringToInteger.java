package com.alien.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertStringToInteger {

	public static void main(String[] args) {

		String[] arr = { "1", "2", "3", "4", "5" };

		List<String> list = Arrays.asList(arr);

		List<Integer> collect = list.stream().map(Integer::valueOf).collect(Collectors.toList());

		collect.forEach(e -> System.out.print(e+" "));

	}
}
