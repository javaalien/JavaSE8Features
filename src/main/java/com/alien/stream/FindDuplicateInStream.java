package com.alien.stream;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// How to find duplicate elements in a Stream in Java?

public class FindDuplicateInStream {

	public static void main(String[] args) {

		Stream<Integer> stream = Stream.of(2, 17, 5, 20, 17, 30, 4, 23, 59, 23);

		System.out.println(findDuplicateInStream(stream));
	}

	private static Set<Integer> findDuplicateInStream(Stream<Integer> stream) {

		Set<Integer> set = new HashSet<>();

		return stream.filter(n -> !set.add(n)).collect(Collectors.toSet());
	}
}
