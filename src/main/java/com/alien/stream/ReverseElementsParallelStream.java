package com.alien.stream;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// How to Reverse elements of a Parallel Stream in Java?

public class ReverseElementsParallelStream {

	public static void main(String[] args) {

		List<Integer> lists = Arrays.asList(217, 317, 417, 517);

		Stream<Integer> stream = lists.parallelStream();

		stream.collect(reverseStream()).forEach(System.out::println);
	}

	private static <T> Collector<T, ?, Stream<T>> reverseStream() {

		return Collectors.collectingAndThen(Collectors.toList(), list -> {
			Collections.reverse(list);
			return list.stream();
		});

	}

}
