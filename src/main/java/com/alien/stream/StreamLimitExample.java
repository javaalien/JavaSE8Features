package com.alien.stream;

import java.util.stream.Stream;

public class StreamLimitExample {

	public static void main(String[] args) {
		Stream<Integer> infiniteNumbers = Stream.iterate(1, n -> n + 1);

		Stream<Integer> limitedNumbers = infiniteNumbers.limit(5);

		System.out.println("Limited Numbers :");

		limitedNumbers.forEach(System.out::println);

	}

}
