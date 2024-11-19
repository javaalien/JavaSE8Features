package com.alien.stream;

import java.util.stream.Stream;

public class StreamPeekExample {

	public static void main(String[] args) {

		Integer[] numbers = { 1, 2, 3, 4, 5 };

		Integer[] processedNumbers = Stream.of(numbers).peek(num -> System.out.println("Processing Number :" + num))
				.toArray(Integer[]::new);

		System.out.println("Processed numbers:");
		Stream.of(processedNumbers).forEach(System.out::println);
	}

}
