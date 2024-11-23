package com.alien.stream;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class JavaCollectMinMaxEx {

	public static void main(String[] args) {

		List<Integer> val = List.of(1, 2, 3, 4, 5, 6, 7);

		Optional<Integer> min = val.stream().collect(Collectors.minBy(Integer::compareTo));

		Optional<Integer> max = val.stream().collect(Collectors.maxBy(Integer::compareTo));

		min.ifPresent(v -> System.out.printf("Minimum is %d%n", v));
		max.ifPresent(v -> System.out.printf("Maximum is %d%n", v));

	}
}
