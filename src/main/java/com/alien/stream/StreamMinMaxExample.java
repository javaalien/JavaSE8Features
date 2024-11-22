package com.alien.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class StreamMinMaxExample {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(10, 3, 7, 0, -1, 8);

		Optional<Integer> min = numbers.stream().min(Comparator.naturalOrder());

		Optional<Integer> max = numbers.stream().max(Comparator.naturalOrder());

		min.ifPresent(m -> System.out.println("The minimum value is: " + m));

		max.ifPresent(m -> System.out.println("The Maximum value is: " + m));

	}

}
