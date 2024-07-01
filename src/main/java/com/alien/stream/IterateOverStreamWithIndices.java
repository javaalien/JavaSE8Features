package com.alien.stream;

import java.util.stream.IntStream;

public class IterateOverStreamWithIndices {

	public static void main(String[] args) {

		String[] array = { "A", "L", "I", "E", "N" };

		IntStream.range(0, array.length).mapToObj(index -> String.format("%d -> %s", index, array[index]))
				.forEach(System.out::println);

	}
}
